package LLD.design_patterns.Behavioral_Design_Pattern.strategy_design_patterns.withStrategyDesignPattern;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
