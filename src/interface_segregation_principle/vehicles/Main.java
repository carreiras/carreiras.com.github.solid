package interface_segregation_principle.vehicles;

public class Main {

    private static String type;

    public static void main(String[] args) {
        type = "Car";

        if (type == "Car") {
            Car car = new Car("Azul", "2023", 2.0, 4);
        } else {
            Motorcycle motorcycle = new Motorcycle("Branca", "2022", 250);
        }
    }
}
