package ru.vsu.cs;

public class ResearchAssociate extends Employee {

	public String fieldOfStudy;

	public ResearchAssociate(int ssNo, String name, String email, int counter) {
		super(ssNo, name, email, counter);
	}

	public String getFieldOfStudy() {
		return fieldOfStudy;
	}

	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	public void leadsProject() {}

}