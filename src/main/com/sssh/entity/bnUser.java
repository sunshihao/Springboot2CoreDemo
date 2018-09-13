package com.sssh.entity;
 
public class bnUser {
	
	private String userId;
	private String userPhone;
	private String userName;
	private String hisMoney;
	
	
	public String getUserId() {
		return userId;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public String getUserName() {
		return userName;
	}
	public String getHisMoney() {
		return hisMoney;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setHisMoney(String hisMoney) {
		this.hisMoney = hisMoney;
	}
	
	@Override
	public String toString() {
 
		return "{userId:"+userId+",userPhone:"+userPhone+",userName:"+userName+",hisMoney:"+hisMoney+"}";
	}
}