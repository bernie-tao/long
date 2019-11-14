package com.tao.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tao.pojo.Syb;
import com.tao.service.SybService;

@Controller
@RequestMapping("/SYB")
public class SybController {
@Autowired
SybService sybService;
//登录
@RequestMapping("/login")
public String login1(Syb syb,Model model,HttpSession session){
	Syb sybs=sybService.login(syb);
	if(sybs!=null){
		System.out.println("登录成功");
		session.setAttribute("sybs", sybs);
		
		return "ok";
	}else{
		model.addAttribute("msg", "账号或者密码错误");
	    return "login";
	}
}
//更新
@RequestMapping("/update")
public String update1(Syb syb){
	int i=sybService.updid(syb);
	
	if(i>0){
		return "success";
	}else{
		return "false";
	}
	
}
}
