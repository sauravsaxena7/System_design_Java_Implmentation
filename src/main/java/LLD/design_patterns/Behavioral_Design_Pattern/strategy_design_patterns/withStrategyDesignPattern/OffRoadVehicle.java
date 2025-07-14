package LLD.design_patterns.Behavioral_Design_Pattern.strategy_design_patterns.withStrategyDesignPattern;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
