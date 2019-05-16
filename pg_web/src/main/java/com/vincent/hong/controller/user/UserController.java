package com.vincent.hong.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vincent.hong.result.BaseResult;
import com.vincent.hong.result.ResultUtil;




@Controller
@RequestMapping("/user")
public class UserController {
	private static final  Logger LOGGER=  LoggerFactory.getLogger(UserController.class);
	@RequestMapping("/login")
	public @ResponseBody BaseResult login(HttpServletRequest request){
		String email =request.getParameter("email");
		String password =request.getParameter("password");
		LOGGER.info("登录信息,登录名:{} 登录密码:{}",email,password );
		//返回数据信息 
		return ResultUtil.success();
	}
	
	@RequestMapping("/index")
	public String loginResult(HttpServletRequest request){
		return "login/index" ;
	}
}
