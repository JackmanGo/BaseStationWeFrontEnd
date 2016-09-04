package com.jinantech.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinantech.dao.CellInfoDao;
import com.jinantech.domain.CellInfo;
import com.jinantech.service.CellInfoService;

@Service
public class CellInfoServiceImpl implements CellInfoService{

	@Autowired
	private CellInfoDao cellInfoDao;
	@Override
	public void addCellInfo(CellInfo cellInfo) {
		// TODO Auto-generated method stub
		cellInfoDao.save(cellInfo);
	}
	@Override
	public void addCellInfoList(List<CellInfo> cellInfos) {
		// TODO Auto-generated method stub
		for(CellInfo cellInfo:cellInfos){
			cellInfoDao.save(cellInfo);
		}
	}
	@Override
	public void updateCellInfo(CellInfo cellInfo) {
		// TODO Auto-generated method stub
		cellInfoDao.deleteCellInfoById(cellInfo.getId());
		cellInfoDao.save(cellInfo);
	}

}
