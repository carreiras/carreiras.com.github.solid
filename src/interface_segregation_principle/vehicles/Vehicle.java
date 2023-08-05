package interface_segregation_principle.vehicles;

public interface Vehicle {

    public void configureCar(String color, String year, double engine, int seats);

    public void configureMotorcycle(String color, String year, double engine);

    public void startVehicle();
}
