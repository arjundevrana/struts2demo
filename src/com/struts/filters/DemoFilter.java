package com.struts.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoFilter implements Filter{

	@Override
	public void destroy() {
		System.out.println("On Filter destroy call");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println("Filter Doing somthing call");
		 filterChain.doFilter(request, response);
		 System.out.println("After action call");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Filter initilization call");
		
	}

}
