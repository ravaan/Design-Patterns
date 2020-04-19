package parking;

import vehicles.Vehicle;

public class ParkingDisplayBoard {
    private String id;
    private LargeSpot largeFreeSpot;

    public LargeSpot getLargeFreeSpot() {
        return largeFreeSpot;
    }

    public void setLargeFreeSpot(LargeSpot largeFreeSpot) {
        this.largeFreeSpot = largeFreeSpot;
    }

    public void showEmptySpotNumber(Vehicle vehicle) {
        //noinspection SwitchStatementWithTooFewBranches
        switch (vehicle.getType()) {
            case CAR:
                System.out.println("CAR: " + largeFreeSpot.toString());
                break;
            default:
                System.out.println("WRONG ENUM TYPE");
                break;
        }
    }
}


