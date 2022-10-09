package com.aaeetii.projetmaven;

import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	private int age;	
	private Computer com;	
	
	public Alien() { 
		System.out.println("Alien Object created.");
	}	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("Age assigned");
	}

	public Computer getComputer() {
		return com;
	}

	public void setComputer(Computer com) {
		this.com = com;
	}

	public void code() {
		System.out.println("I am coding...");
		com.compile();
	}

}
