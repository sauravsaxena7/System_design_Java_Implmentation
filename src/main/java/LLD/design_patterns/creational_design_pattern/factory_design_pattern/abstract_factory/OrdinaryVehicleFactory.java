package LLD.design_patterns.creational_design_pattern.factory_design_pattern.abstract_factory;

public class OrdinaryVehicleFactory implements VehicleFactory {


    @Override
    public Vehicle getVehicleFactory(String input) {
        return switch (input){
            case "HUNDAI" -> new Hundai();
            case "NANO" -> new Nano();
            default -> null;
        };
    }
}
