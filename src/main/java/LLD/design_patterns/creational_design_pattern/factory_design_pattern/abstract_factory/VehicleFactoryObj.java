package LLD.design_patterns.creational_design_pattern.factory_design_pattern.abstract_factory;

public class VehicleFactoryObj {

    VehicleFactory getVehicleFactory(String name){
        return switch (name){
            case "ORDINARY" -> new OrdinaryVehicleFactory();
            case "LUXURY" -> new LuxuryVehicleFactory();
            default -> null;
        };
    }
}
