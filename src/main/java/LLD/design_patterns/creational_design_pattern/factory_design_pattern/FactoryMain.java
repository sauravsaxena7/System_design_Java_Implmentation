package LLD.design_patterns.creational_design_pattern.factory_design_pattern;

public class FactoryMain {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("CIRCLE");

        shape.draw();
    }
}
