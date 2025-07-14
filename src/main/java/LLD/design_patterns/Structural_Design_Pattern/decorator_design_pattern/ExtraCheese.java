package LLD.design_patterns.Structural_Design_Pattern.decorator_design_pattern;

public class ExtraCheese extends ToppingDecorator{

    BasePizza pizza;

    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost()+10;
    }
}
