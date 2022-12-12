package ru.vsu.cs;

import java.util.Collection;

public class Course {

	Collection<Lecturer> teaches;
	public String name;
	public int id;
	public float hours;

	public Course(Collection<Lecturer> teaches, String name, int id, float hours) {
		this.teaches = teaches;
		this.name = name;
		this.id = id;
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "Course{" +
				"teaches=" + teaches +
				", name='" + name + '\'' +
				", id=" + id +
				", hours=" + hours +
				'}';
	}

	public void addCourse(){}

	public void deleteCourse(){}
}