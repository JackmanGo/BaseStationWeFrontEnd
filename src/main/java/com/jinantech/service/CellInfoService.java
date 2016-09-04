package com.jinantech.service;

import java.util.List;

import com.jinantech.domain.CellInfo;

public interface CellInfoService {
   public void addCellInfo(CellInfo cellInfo);
   public void addCellInfoList(List<CellInfo> cellInfos);
   public void updateCellInfo(CellInfo cellInfo);
}
