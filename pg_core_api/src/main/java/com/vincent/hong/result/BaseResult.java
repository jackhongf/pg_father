package com.vincent.hong.result;

/**
 * 
 * @description [封装通用返回json的对象]
 * @author vincent hong
 * @time 2018-02-05  22:07:49
 */
public class BaseResult {
	
	private String status;
	
	private Object context;
	
	private String message;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getContext() {
		return context;
	}

	public void setContext(Object context) {
		this.context = context;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
