package com.lyx.action;

public class BookActionLogin extends BookAction {

	public String execute(){
		
		String result = "invalid";
		
		System.out.println("<"+username+","+password+">");
		if(!username.equals("")){
			result = "valid";
		}
		return result;
	}
}
