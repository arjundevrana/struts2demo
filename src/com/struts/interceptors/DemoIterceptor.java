package com.struts.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class DemoIterceptor implements Interceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1243561278911887099L;

	@Override
	public void destroy() {
		System.out.println("Interceptor destroy call");
		
	}

	@Override
	public void init() {
		System.out.println("Interceptor Initilazation  call");
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("CustomInterceptor, before invocation.invoke()...");

		String result = invocation.invoke();

		System.out.println("CustomInterceptor, after invocation.invoke()..." + result);

		return result;
	}

}
