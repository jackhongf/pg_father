package com.vincent.hong.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @description [系统首页入口]
 * @author vincent hong
 * @time 2018-02-05  19:50:23
 */
@Controller
@RequestMapping
public class PageIndexController{
	
	/**
	 * 
	 * @description [说明其用处]
	 * @author vincent hong
	 * @param param
	 * @return
	 * @time 2018-02-05  19:45:21
	 */
	@RequestMapping("/index")
	public String loginPage(String param) {
		return "login/login";
	}

}
