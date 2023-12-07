package com.effectivejava.tutorial.itema12toString;

public class ItemTwelveTest {
	public static void main(String[] args) {
		
		Request request = new Request();
		request.setHeader("Kafa");
		request.setBody("Govde");
		
		System.out.println(request.toString());
		
	}

}
