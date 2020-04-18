public class ParkingFloor {
    private String name;
    private HashMap<String, LargeSpot> largeSpots;
    private ParkingDisplayBoard displayBoard;


	public ParkingDisplayBoard getDisplayBoard() {
		return this.displayBoard;
	}

	public void setDisplayBoard(ParkingDisplayBoard displayBoard) {
		this.displayBoard = displayBoard;
	}
  
    public ParkingFloor(String name) {
      this.name = name;
    }
  
    public void addParkingSpot(ParkingSpot spot) {
      switch (spot.getType()) {
      case ParkingSpotType.LARGE:
        largeSpots.put(spot.getNumber(), spot);
        break;
      default:
        print("Wrong parking spot type!");
      }
    }
  
    public void assignVehicleToSpot(Vehicle vehicle, ParkingSpot spot) {
      spot.assignVehicle(vehicle);
      switch (spot.getType()) {
      case ParkingSpotType.LARGE:
        updateDisplayBoardForLarge(spot);
        break;
      default:
        print("Wrong parking spot type!");
      }
    }
  
    private void updateDisplayBoardForLarge(ParkingSpot spot) {
      if (this.displayBoard.getLargeFreeSpot().getNumber() == spot.getNumber()) {
        // find another free Large parking and assign to displayBoard
        for (String key : largeSpots.keySet()) {
          if (largeSpots.get(key).isFree()) {
            this.displayBoard.setLargeFreeSpot(largeSpots.get(key));
          }
        }
        this.displayBoard.showEmptySpotNumber();
      }
    }
  
    public void freeSpot(ParkingSpot spot) {
      spot.removeVehicle();
      switch (spot.getType()) {
      case ParkingSpotType.LARGE:
        freeLargeSpotCount++;
        break;
      default:
        print("Wrong parking spot type!");
      }
    }
  }