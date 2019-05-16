package com.vincent.hong.enums.result;
/**
 * 
 * @description [用于归纳所有的状态 .]
 * 注:状态码的百分位指代功能区,其他位代表错误.
 *   功能序号
 *       0:为通用返回信息,其他功能序号为业务模块序号
 * @author vincent hong
 * @time 2018-02-05  21:36:38
 */
public enum ResultStatusEm {
	SUCCESS("000","成功"),
	   FAIL("011","失败"),
	  ERROR("099","系统异常"),
	  
	  //用户模块
	  USER101("101","用户不存在"),
	  
	  //权限部分
	  AUTH101("201","权限不足");

	  
	private String code;
	
	private String description;
	
	private ResultStatusEm(String code,String description) {
		this.code=code;
		this.description=description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
