package LLD.design_patterns.creational_design_pattern.builder;

public class ClientMain {
    public static void main(String[] args){
        Director director1 = new Director(new EngineeringStudentBuilder());
        Director director2 = new Director(new MBAStudentBuilder());

        Student engineer = director1.createStudent();
        Student  mba= director2.createStudent();

        System.out.println(engineer.toString());
        System.out.println(mba.toString());
    }
}
