package com.richard;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style= Style.RPC)
public class Hello {
	@WebMethod
	public String bonjour( String name) {
		return "Bonjour " + name;
	}
	
}
