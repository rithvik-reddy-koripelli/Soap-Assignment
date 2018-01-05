package com.accolite.mini_au.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.accolite.mini_au.models.Person;

@WebService
public interface CrudInterface {
	@WebMethod Person getPerson(@WebParam(name="id")int id);
	@WebMethod boolean addPerson(@WebParam(name="id") int id,@WebParam(name="name") String name,@WebParam(name="email") String email);
	@WebMethod Person updatePerson(@WebParam(name="id") int id,@WebParam(name="name") String name,@WebParam(name="email") String email);
	@WebMethod Person deletePerson(@WebParam(name="id") int id);
}
