package com.effectivejava.tutorial.itema12toString;

import java.util.Objects;

public class Request {
	
	public String header;
	public String body;
	
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
	/*
	@Override
	public String toString() {
		return "Request [header=" + header + ", body=" + body + "]";
	}
	*/
	/*
	// bu da bu sinifin verilerini istediginde Json olarak gonderiyor
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
	*/
	
	
	

}
