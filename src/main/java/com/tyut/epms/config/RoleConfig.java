package com.tyut.epms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.tyut.epms.interceptor.LoginInterceptor;
import com.tyut.epms.interceptor.RoleInterceptor;

@Configuration
public class RoleConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		registry.addInterceptor(new RoleInterceptor()).addPathPatterns(
				"/toEmpList","/toAddEmp","/toRegister","/toDepList","/toAddDep"
				,"/toRoleList","/toAddRole","/toAttendanceList","/toApproval"
				);
			
	}

}
