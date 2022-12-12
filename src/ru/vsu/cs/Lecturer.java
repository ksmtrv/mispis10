package ru.vsu.cs;

public class Lecturer extends ResearchAssociate {

    public Lecturer(int ssNo, String name, String email, int counter) {
        super(ssNo, name, email, counter);
    }

    public void conductExams() {}

    public void readCourse() {}
}