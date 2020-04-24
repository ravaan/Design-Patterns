package parking;

import java.util.HashMap;
import java.util.List;

public class ParkingFloor {
    private String name;
    private HashMap<String, LargeSpot> largeSpots;
    private ParkingDisplayBoard displayBoard;

    public ParkingFloor(String name, HashMap<String, LargeSpot> largeSpots) {
        this.name = name;
        this.largeSpots = largeSpots;
        List values = (List) largeSpots.values();
        displayBoard = new ParkingDisplayBoard(((LargeSpot) values.get(0)).getNumber(), (LargeSpot) values.get(0));
    }

    public String getName() {
        return name;
    }


    public void updateDisplayBoard() {

    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        //noinspection SwitchStatementWithTooFewBranches
        switch (parkingSpot.getSpotType()) {
            case LARGE:
                largeSpots.put(parkingSpot.getNumber(), (LargeSpot) parkingSpot);
                break;
            default:
                System.out.println("Wrong Spot Type");
                break;
        }
    }

    public void assignVehicleToSpot() {
        LargeSpot largeFreeSpot = displayBoard.getLargeFreeSpot();
        largeFreeSpot.setFree(false);

    }

    public void freeUpSpot() {

    }
}
