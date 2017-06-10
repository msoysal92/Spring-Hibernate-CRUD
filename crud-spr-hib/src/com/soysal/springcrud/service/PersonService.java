package com.soysal.springcrud.service;

import java.util.List;

import com.soysal.springcrud.model.Person;

public interface PersonService {

	public List<Person> getAllPersons();
	
	public List<Person> deletePerson(List<Person> personList, Person p);
}
