package parking;

public class ParkingDisplayBoard {
    private String id;
    private LargeSpot largeFreeSpot;

    public ParkingDisplayBoard(String id, LargeSpot largeFreeSpot) {
        this.id = id;
        this.largeFreeSpot = largeFreeSpot;
    }

    public LargeSpot getLargeFreeSpot() {
        return largeFreeSpot;
    }

    public void setLargeFreeSpot(LargeSpot largeFreeSpot) {
        this.largeFreeSpot = largeFreeSpot;
    }

    public void showEmptySpotNumber() {
        System.out.println("LargeSpot: " + largeFreeSpot.getNumber());
    }
}


