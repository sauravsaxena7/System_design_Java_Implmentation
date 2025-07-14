package LLD.design_patterns.creational_design_pattern.factory_design_pattern.factory;

public class ShapeFactory {
    Shape getShape(String input){
        return switch (input) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
