package LLD.design_patterns.creational_design_pattern.factory_design_pattern.abstract_factory;

public class LuxuryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicleFactory(String input) {
        return switch (input){
            case "LAM" -> new Lamborghini();
            case "BMW" -> new BMW();
            default -> null;
        };
    }
}
