package org.salem.domain.vo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ValueGenerationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsersVO {
	
	private int userNo;
	private String userEmail;
	private String userName;
	private String userPw;
	private String userPhone;
	private String userAddress;
	private String userProfile;
	private Date userDate;
	public UsersVO(String userEmail, String userName, String userPw, String userPhone, String userAddress) {
		super();
		this.userEmail = userEmail;
		this.userName = userName;
		this.userPw = userPw;
		this.userPhone = userPhone;
		this.userAddress = userAddress;
	}
	
	
}
