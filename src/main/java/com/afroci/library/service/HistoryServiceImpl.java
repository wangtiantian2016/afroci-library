package com.afroci.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afroci.library.dao.HistoryDao;
import com.afroci.library.model.History;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service(value = "historyService")
public class HistoryServiceImpl implements HistoryService{
	
	@Autowired
	private HistoryDao historyDao;

	@Override
	public List<History> selectHistoryByBorrowUser(String userID) {
		
		return historyDao.selectXmlHistoryByBorrowUser(userID);
	}
	
}
