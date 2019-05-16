package com.vincent.hong.result;

import com.vincent.hong.enums.result.ResultStatusEm;

public class ResultUtil {
	
	/**
	 * 
	 * @description [返回成功且返回数据]
	 * @author vincent hong
	 * @param data
	 * @return
	 * @time 2018-02-05  22:09:05
	 */
	public static BaseResult success(Object data) {
		BaseResult result =new  BaseResult();
		result.setStatus(ResultStatusEm.SUCCESS.getCode());
		result.setMessage(ResultStatusEm.SUCCESS.getDescription());
		result.setContext(data);
		return result;
	}
	
	/**
	 * 
	 * @description [返回成功不返回数据]
	 * @author vincent hong
	 * @return
	 * @time 2018-02-05  22:09:27
	 */
	public static BaseResult success() {
		return success(null);
	}
	
	/**
	 * 
	 * @description [返回失败]
	 * @author vincent hong
	 * @param status
	 * @param msg
	 * @return
	 * @time 2018-02-05  22:09:58
	 */
	public static BaseResult error(String status, String msg) {
		BaseResult result = new BaseResult();
        result.setStatus(status);
        result.setMessage(msg);
        return result;
    }
}
