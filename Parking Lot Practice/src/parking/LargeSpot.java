package parking;

import vehicles.VehicleType;

public class LargeSpot extends ParkingSpot {
    public LargeSpot(String number) {
        super(number, ParkingSpotType.LARGE, VehicleType.CAR);
    }
}
