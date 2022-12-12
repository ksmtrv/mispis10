package ru.vsu.cs;

public class Faculty {

	public Employee dean;
	public String name;

	public Faculty(Employee dean, String name) {
		this.dean = dean;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Faculty{" +
				"dean=" + dean +
				", name='" + name + '\'' +
				'}';
	}

	public Employee getDean() {
		return dean;
	}

	public String getName() {
		return name;
	}

	public void setDean(Employee dean) {
		this.dean = dean;
	}

	public void setName(String name) {
		this.name = name;
	}
}