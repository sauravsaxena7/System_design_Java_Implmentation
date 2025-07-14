package LLD.design_patterns.Behavioral_Design_Pattern.strategy_design_patterns.withStrategyDesignPattern;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");

    }
}
