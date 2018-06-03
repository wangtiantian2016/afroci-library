package com.afroci.library.service;

import java.util.List;

import com.afroci.library.model.History;

public interface  HistoryService {
	
	List<History> selectHistoryByBorrowUser(String userID);
	
}
