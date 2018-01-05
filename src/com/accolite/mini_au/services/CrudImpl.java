package com.accolite.mini_au.services;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.accolite.mini_au.models.Person;
@WebService(endpointInterface="com.accolite.mini_au.services.CrudInterface")
public class CrudImpl implements CrudInterface{
	
	List <Person> list ;
	public  CrudImpl() {
		list = new ArrayList<Person>();
	}
	
	@Override
	public Person getPerson(@WebParam(name="id")int id) {
		for(Person p:list)
		{
			if(p.getId()==id)
				return p;
		}
		return null;
	}

	@Override
	public boolean addPerson(@WebParam(name="id") int id,@WebParam(name="name") String name,@WebParam(name="email") String email) {
		
		list.add(new Person(id,name,email));
		return true;
	}

	@Override
	public Person updatePerson(@WebParam(name="id") int id,@WebParam(name="name") String name,@WebParam(name="email") String email) {
		for(Person p:list)
		{
			if(p.getId()==id)
			{
				p.setName(name);
				p.setEmail(email);
				return p;
			}
		}
		return null;
	}

	@Override
	public Person deletePerson(@WebParam(name="id")int id) {
		
		for(Person p:list)
		{
			if(p.getId()==id)
			{
				list.remove(p);
				return p;
			}
		}
		return null;
	}
	
	
}
