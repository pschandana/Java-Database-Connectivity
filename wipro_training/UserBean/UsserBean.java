package com.wipro_training.UserBean;

public class UsserBean {
	private String UserID;
	private String Password;
	private String Name;
	private int IncorrectAttempts;
	private int LockStatus;
	private String UserType;
	
	public UsserBean(){
		
	}
	public String getUserId() {
		return UserID;
	}
	public void setUserId(String UserID) {
		this.UserID = UserID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public int getIncorrectattempts() {
		return IncorrectAttempts;
	}
	public void setIncorrectAttempts(int IncorrectAttempts) {
		this.IncorrectAttempts = IncorrectAttempts;
	}
	public int getLockStatus() {
		return LockStatus;
	}
	public void setLockStatus(int LockStatus) {
		this.LockStatus = LockStatus;
	}
	public String getUserType() {
		return UserType;
	}
	public void setUserType(String UserType) {
		this.UserType = UserType;
	}
	
}
