package vehicles;

public class Car extends Vehicle {
    private String name;

    public Car(String licenseNumber, String name) {
        super(licenseNumber, VehicleType.CAR);
        this.name = name;
    }
}
