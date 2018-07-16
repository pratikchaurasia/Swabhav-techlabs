package com.techlabs.actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.omg.PortableInterceptor.SUCCESSFUL;

public class SessionAction implements SessionAware{
	private Map<String, Object> userSession ;

	@Override
	public void setSession(Map<String, Object> session) {
	   userSession = session ;
	}
	public String execute(){  
		increaseHelloCount();
		return "success";
	}
	
	private void increaseHelloCount() {
	    Integer helloCount = (Integer) userSession.get("newcount");

	    if (helloCount == null ) {
	        helloCount = 0;
	    } else {
	    	userSession.put("oldcount", helloCount);
	        helloCount++;
	    }

	    userSession.put("newcount", helloCount);
	}

}
