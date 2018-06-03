package com.afroci.library.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class HistoryList extends BaseModel{
	List<History> historyList = new ArrayList<History>();

}
