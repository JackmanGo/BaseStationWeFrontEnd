package com.jinantech.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinantech.dao.SessionInfoDao;
import com.jinantech.domain.SessionInfo;
import com.jinantech.service.SessionInfoService;

@Service
public class SessionInfoServiceImpl implements SessionInfoService{
    
	@Autowired
    private SessionInfoDao sessionInfoDao;
    
    @Override
	public void addSessionInfo(SessionInfo sessionInfo) {
		// TODO Auto-generated method stub
    	sessionInfoDao.save(sessionInfo);
		
	}

	@Override
	public void addSessionInfoList(List<SessionInfo> sessionInfos) {
		// TODO Auto-generated method stub
		for(SessionInfo sessionInfo:sessionInfos){
			sessionInfoDao.save(sessionInfo);
		}
	}

}
