package com.jinantech.controller;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.jinantech.domain.CellInfo;
import com.jinantech.domain.SessionInfo;
import com.jinantech.service.CellInfoService;
import com.jinantech.service.SessionInfoService;
import com.jinantech.socketService.domain.BaseStationInfo;
import com.jinantech.socketService.domain.Local;
import com.jinantech.util.HttpRequest;

@RestController
public class CollectInformationController {
	@Autowired
	private CellInfoService cellInfoService;
	@Autowired
	private SessionInfoService sessionInfoService;
	@Autowired
	private HttpRequest httpRequest;
	// 通过一个线程安全的集合来保存已经在地图上显示的基站
	static Set alreadShowStation = Collections.synchronizedSet(new HashSet());

	@RequestMapping(value="/uploadCellInfo",method=RequestMethod.POST)
	public void collectCellInfo(@RequestBody CellInfo cellInfo){
    	cellInfoService.addCellInfo(cellInfo);
    }

	@RequestMapping(value = "/uploadSessionInfo", method = RequestMethod.POST)
	public void collectSessionInfo(@RequestBody SessionInfo sessionInfo) {
		sessionInfoService.addSessionInfo(sessionInfo);
        boolean isShow =  alreadShowStation.add(sessionInfo.getLac()+sessionInfo.getCid());
    	
    	//添加成功则可显示于界面
    	if(isShow){
    	    //查询接口来定位
    	     String parameter ="lac="+sessionInfo.getLac()+"&cid="+sessionInfo.getCid();
    	     String str = httpRequest.sendGet("http://www.cellid.cn/cidInfo.php",parameter);
    	     System.out.println(str);
    	     if(str.contains("未查到该数据")){
    	    	 //未查询到的基站
    	    	 System.out.println("未查询到该数据...");
    	     }else{
    	    	 
    	    	 //cidMap(30.547938,104.066144,'(33033,45411)	30.547938,104.066144<br>四川省成都市武侯区天府大道中段688号萃华路')
    	       String[] local =  str.split("\\("+sessionInfo.getLac()+","+sessionInfo.getCid()+"\\)")[1].split("<br>");
    	       String coordinates[] = local[0].split(",");
    	       String latitude = coordinates[0];
    	       String longitude = coordinates[1];
    	       String detailLocal = local[1].split("'")[0];
    	       Local baseStationLocal =  new BaseStationInfo();
    	       baseStationLocal.setLatitude(Double.valueOf(latitude));
    	       baseStationLocal.setLongitude(Double.valueOf(longitude));
    	       //发送到前端
    	       TransmissionLocationWebSocket.sendUserLocal(new Gson().toJson(baseStationLocal));
    	     }
    	}
	}

	@RequestMapping(value = "/uploadCellInfoList", method = RequestMethod.POST)
	public void collectCellInfoList(@RequestBody List<CellInfo> cellInfos) {
		cellInfoService.addCellInfoList(cellInfos);
	}

	@RequestMapping(value = "/uploadSessionInfoList", method = RequestMethod.POST)
	public void collectSessionInfoList(@RequestBody List<SessionInfo> sessionInfos) {
		sessionInfoService.addSessionInfoList(sessionInfos);
	}

	@RequestMapping(value = "/updateCellInfo", method = RequestMethod.POST)
	public void updateCellInfo(@RequestBody CellInfo cellInfo) {
		cellInfoService.updateCellInfo(cellInfo);
	}

}
