package com.mobile.bl;

public class Airtel {
 private Service service;
 

public void setService(Service service) {
	this.service = service;
}

public void activeService() {
	 service.service();
 }
}
