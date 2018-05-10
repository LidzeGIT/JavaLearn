package ru.specialist.stuff;

import java.util.ArrayList;

public class Person {
	public String name = "Незнакомец";
	public int age;
	{
		age = 18;
	}
	
	static ArrayList<Person> persons = new ArrayList<>();
	// persons.add()
	// static void showAll()
	public static int counter = 0;
	
	static {
		counter = 0;
	}
	
	public static void showTotal() {
		System.out.printf("Total persons: %d\n", Person.counter);
	}
	
	public Person() {
		this("Unknown", 18);
	}
	public Person(String name) {
		this(name, 18);
		//name = _name;
		//age = 18;
	}
	public Person(int age) {
		this("Unknown", age);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age  = age;
		counter++;
		persons.add( this ); // bad
	}
	
	public static void showAll() {
		for(Person p : persons)
			p.show();
	}
	
	public void show() {
		System.out.printf("%s - %d\n", this.name, this.age);
	}
}
