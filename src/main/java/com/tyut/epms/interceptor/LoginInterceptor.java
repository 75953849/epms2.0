package com.tyut.epms.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

import com.tyut.epms.bean.Login;

public class LoginInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("lanjieqilanjie拦截");
		Login login = (Login)request.getSession().getAttribute("login");
		System.out.println(login);
		if(login==null) {
			System.out.println("拦截---跳转");
			request.setAttribute("msg", "请登录");
			request.getRequestDispatcher("/").forward(request, response);
		}
		return true;
	}
}
