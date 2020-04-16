package com.tyut.epms.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

import com.tyut.epms.bean.Employee;
import com.tyut.epms.bean.Login;

public class RoleInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Employee emp = (Employee)request.getSession().getAttribute("e");
		System.out.println(emp.getRoleName());
		if(emp==null) {
			System.out.println("emp为空   ----");
			request.setAttribute("msg", "请登录");
			request.getRequestDispatcher("/").forward(request, response);
		}else {
			if(emp.getRoleName().equals("员工")) {
				System.out.println("员工权限不足被拦截");
				request.getRequestDispatcher("/toRoleError").forward(request, response);
			}
		}
		return true;
	}
}
