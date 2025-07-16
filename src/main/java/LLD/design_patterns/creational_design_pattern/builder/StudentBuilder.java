package LLD.design_patterns.creational_design_pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class StudentBuilder {
    int rollNumber;//mandatory
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;

    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public StudentBuilder setSubjects() {
       List<String> subs=new ArrayList<>();
       subs.add("JAVa");
       this.subjects=subs;
        return this;
    }

    public Student build(){
        return new Student(this);
    }
}
