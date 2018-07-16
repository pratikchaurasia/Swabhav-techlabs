package com.techlabs.actions;

import org.omg.CosNaming.IstringHelper;

import com.opensymphony.xwork2.Action;

public class BrowseAction implements Action {
	private boolean postback=false;

	@Override
	public String execute() throws Exception {
		return this.SUCCESS;
	}
	
	private String date="1996-08-11";
	public String getDate(){
		return date;
	}
	
	
	private String methodtype="get";
	public String getMethodtype(){
		if(postback){
			methodtype="post";
		}
		return methodtype;
	}
	public boolean isPostback() {
		return postback;
	}
	public void setPostback(boolean postback) {
		this.postback = postback;
	}
}
