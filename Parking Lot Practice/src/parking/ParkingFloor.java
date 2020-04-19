package parking;

import java.util.HashMap;
import java.util.Random;

public class ParkingFloor {
    private String name;
    private HashMap<String, LargeSpot> largeSpots;

    public ParkingFloor(String name, HashMap<String, LargeSpot> largeSpots) {
        this.name = name;
        this.largeSpots = largeSpots;
    }

    public String getName() {
        return name;
    }


    public void updateDisplayBoard() {

    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        Random random = new Random();
        String spotName = String.format("%04d", random.nextInt(10000));
        //noinspection SwitchStatementWithTooFewBranches
        switch (parkingSpot.getSpotType()) {
            case LARGE:
                largeSpots.put(spotName, (LargeSpot) parkingSpot);
                break;
            default:
                System.out.println("Wrong Spot Type");
                break;
        }
    }

    public void assignVehicleToSpot() {

    }

    public void freeUpSpot() {

    }
}
