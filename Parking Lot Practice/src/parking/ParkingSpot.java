package parking;

public abstract class ParkingSpot {
    private String number;
    private ParkingSpotType spotType;
    private boolean free;

    public ParkingSpot(String number, ParkingSpotType spotType) {
        this.number = number;
        this.spotType = spotType;
    }

    public String getNumber() {
        return number;
    }

    public ParkingSpotType getSpotType() {
        return spotType;
    }

    public boolean isFree() {
        return this.free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
