package ru.vsu.cs;

public abstract class Employee {

	public int ssNo;
	public String name;
	public String email;
	public int counter;

	public Employee(int ssNo, String name, String email, int counter) {
		this.ssNo = ssNo;
		this.name = name;
		this.email = email;
		this.counter = counter;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getCounter() {
		return counter;
	}


}