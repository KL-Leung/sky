package com.sky.interceptor;
/**
 * 拦截器
 * @author marr
 *
 */


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.sky.pojo.User;
import com.sky.tools.Constants;



public class SysInterceptor extends HandlerInterceptorAdapter {
	private Logger logger = Logger.getLogger(SysInterceptor.class);
	
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception{
		logger.debug("SysInterceptor preHandle ==========================");
		HttpSession session = request.getSession();
		
		User user = (User)session.getAttribute(Constants.USER_SESSION);
		//用户访问的url
		String url = request.getRequestURI();
		if(url.indexOf("dologin")>0||1==1){
			return true;
		}
		
		if(null == user){
			response.sendRedirect(request.getContextPath()+"/error.jsp");
			return false;
		}
		return true;
	}
	
	
}
