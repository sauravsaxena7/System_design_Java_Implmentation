package LLD.design_patterns.creational_design_pattern.builder;

public class Director {
    StudentBuilder builder;

    public Director(StudentBuilder builder) {
        this.builder = builder;
    }

    public Student createStudent(){
        if(builder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }else if(builder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }

    private Student createMBAStudent() {
        return builder.setRollNumber(1).setAge(33).setName("ss").setSubjects().build();
    }

    private Student createEngineeringStudent() {
        return builder.setRollNumber(2).setAge(24).setFatherName("myfathername").setMotherName("mothername").build();
    }
}
