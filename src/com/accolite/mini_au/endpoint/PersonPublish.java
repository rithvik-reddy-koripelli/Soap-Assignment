package com.accolite.mini_au.endpoint;

import javax.xml.ws.Endpoint;

import com.accolite.mini_au.services.CrudImpl;

public class PersonPublish {
	public static void main(String[]args)
	{
		Endpoint.publish("http://localhost:9999/Soap-Assignment/Person", new CrudImpl());
	}
}
