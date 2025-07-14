package LLD.design_patterns.Structural_Design_Pattern.decorator_design_pattern;

public class DecoratorMain {

    public static void main(String[] args){
        BasePizza pizza = new Mushroom( new ExtraCheese(new Margherita()));

        System.out.println(pizza.cost());
    }
}
