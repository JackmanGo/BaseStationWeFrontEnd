package com.jinantech.service;

import java.util.List;

import com.jinantech.domain.SessionInfo;

public interface SessionInfoService {
   public void addSessionInfo(SessionInfo sessionInfo);
   public void addSessionInfoList(List<SessionInfo> sessionInfos);
}
