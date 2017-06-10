package com.soysal.springcrud.service;

import java.util.ArrayList;
import java.util.List;

import com.soysal.springcrud.model.Person;

public class PersonServiceImpl implements PersonService{

	@Override
	public List<Person> getAllPersons() {
		
		List<Person> personList = new ArrayList<>();
		
		Person person = new Person("Muhammet", "Soysal");
		personList.add(person);

		return personList;
	}

	@Override
	public List<Person> deletePerson(List<Person> personList, Person p) {
		personList.remove(p);
		return personList;
	}

}
