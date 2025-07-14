package LLD.design_patterns.Behavioral_Design_Pattern.strategy_design_patterns.withStrategyDesignPattern;

public class Vehicle {
    DriveStrategy driveStrategy;
    public  Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy=driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
