package com.jinantech.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.jinantech.domain.CellInfo;

public interface CellInfoDao extends PagingAndSortingRepository<CellInfo,Integer>{
       void deleteCellInfoById(Integer id);
}
