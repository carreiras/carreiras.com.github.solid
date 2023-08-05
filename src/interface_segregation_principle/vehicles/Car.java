package interface_segregation_principle.vehicles;

public class Car implements Vehicle, VehicleCar {

    private String color;
    private String year;
    private double engine;
    private int seats;

    public Car(String color, String year, double engine, int seats) {
        configureCar(color, year, engine, seats);
    }

    @Override
    public void configureCar(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
        System.out.println("Criando um carro: " + color + " " + engine + " " + year + " com " + seats + " assentos.");
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Ligando os motores");
    }
}
