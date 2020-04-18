public abstract class ParkingSpot {
    private String number;

    
    private boolean free;
    private Vehicle vehicle;
    private final ParkingSpotType type;
    
    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean IsFree(){
        return this.free;
    }
  
    public ParkingSpot(ParkingSpotType type) {
      this.type = type;
    }
  
    public boolean assignVehicle(Vehicle vehicle) {
      this.vehicle = vehicle;
      free = false;
    }
  
    public boolean removeVehicle() {
      this.vehicle = null;
      free = true;
    }
  }