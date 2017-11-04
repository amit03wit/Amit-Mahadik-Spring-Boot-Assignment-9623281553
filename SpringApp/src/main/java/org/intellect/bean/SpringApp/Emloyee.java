package org.intellect.bean.SpringApp;

import java.util.Date;

public class Emloyee {
	private String id;
	private String fName;
	private String iName;
	private String lName;
	private String eMail;
	private Number pinCode;
	private Date date;
	private boolean isActive;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public void setLName(String lName) {
		this.lName = lName;
	}
	public String getiName() {
		return iName;
	}
	public String getLName() {
		return lName;
	}
	public void setiName(String iName) {
		this.iName = iName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public Number getPinCode() {
		return pinCode;
	}
	public void setPinCode(Number pinCode) {
		this.pinCode = pinCode;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Emloyee [id=" + id + ", fName=" + fName + ", iName=" + iName + ", eMail=" + eMail + ", pinCode="
				+ pinCode + ", date=" + date + ", isActive=" + isActive + "]";
	}
	
	

}
