package com.afroci.library.model;

import lombok.Data;
import java.util.Date;
@Data
public class BaseModel {
	private String createUser;
	private Date createDate;
	private String updateUser;
	private Date updateDate;
	private String deleteFlag;
	private Date deleteDate;
}
