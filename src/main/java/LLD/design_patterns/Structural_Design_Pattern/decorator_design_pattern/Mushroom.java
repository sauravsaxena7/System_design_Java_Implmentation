package LLD.design_patterns.Structural_Design_Pattern.decorator_design_pattern;

public class Mushroom extends ToppingDecorator{

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+15;
    }
}
