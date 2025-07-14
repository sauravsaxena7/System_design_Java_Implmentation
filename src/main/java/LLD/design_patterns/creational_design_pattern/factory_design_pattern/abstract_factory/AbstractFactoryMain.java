package LLD.design_patterns.creational_design_pattern.factory_design_pattern.abstract_factory;

public class AbstractFactoryMain {
    public static void main(String[] args){
        VehicleFactoryObj vehicleFactoryObj = new VehicleFactoryObj();
        VehicleFactory vehicleFactory =  vehicleFactoryObj.getVehicleFactory("LUXURY");

        Vehicle vehicle = vehicleFactory.getVehicleFactory("BMW");
        vehicle.average();
    }
}
