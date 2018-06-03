package com.afroci.library.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.afroci.library.model.History;
import com.afroci.library.model.HistoryList;

@Mapper
public interface HistoryDao {
	public List<History> selectXmlHistoryByBorrowUser(String userID);
}