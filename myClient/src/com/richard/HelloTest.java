package com.richard;

public class HelloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloService service = new HelloService();
		Hello hello = service.getHelloPort();
		
		String response = hello.bonjour("Betty!!!");
		System.out.println(response);
	}

}
