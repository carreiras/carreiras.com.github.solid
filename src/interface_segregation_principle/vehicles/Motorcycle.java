package interface_segregation_principle.vehicles;

public class Motorcycle implements Vehicle, VehicleMotorcycle {

    private String color;
    private String year;
    private double engine;

    public Motorcycle(String color, String year, double engine) {
        configureMotorcycle(color, year, engine);
    }

    @Override
    public void configureMotorcycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        System.out.println("Criando uma moto: " + color + " " + engine + " " + year);
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Ligando os motores");
    }
}
