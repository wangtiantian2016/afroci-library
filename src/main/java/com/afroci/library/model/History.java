package com.afroci.library.model;

import java.util.Date;

import lombok.Data;

@Data
public class History extends BaseModel{
	private String historyId;
	private String categoryName;
	private String title;
	private String author;
	private String theme;
	private String borrowUser;
	private String borrowStart;
	private String borrowEnd;
}
