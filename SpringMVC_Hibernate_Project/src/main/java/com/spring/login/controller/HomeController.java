package com.spring.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.login.model.Login;
import com.spring.login.model.User;
import com.spring.login.service.userService;

@Controller
public class HomeController {

	@Autowired
	public userService userService;
	
	@RequestMapping(value="/")
	public ModelAndView home() {
		ModelAndView mv=new ModelAndView("home");
		return mv;
	}
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public ModelAndView showRegister() {
		ModelAndView mv=new ModelAndView("register");
		return mv;
	}
	
	@RequestMapping(value="/registerProcess", method = RequestMethod.GET)
	public ModelAndView addUser(HttpServletRequest request,HttpServletResponse response,User user) {
		userService.registerUser(user);
		return new ModelAndView("home");
	}

	//*****************************Login Process******************************************//
	
	@RequestMapping(value="/login")
	public ModelAndView show() {
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping(value="/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginprocess(HttpServletRequest request,HttpServletResponse response,Login login)
	{
		System.out.println("Login process");
		ModelAndView mav=null;
		User user=userService.loginCheck(login);
		if(user!=null)
		{
			//when data is available redirect to welcome page with username
			
			mav=new ModelAndView("welcome");
			mav.addObject("username", user.getUsername());
		}
		else
		{
			//when data is not available redirect to login page with Error
			mav=new ModelAndView("login");
			System.out.println("Wrong");
			mav.addObject("message","User name or password is wrong !");
		}
		return mav;
	}
}
