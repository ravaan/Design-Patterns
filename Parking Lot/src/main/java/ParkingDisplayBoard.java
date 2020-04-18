public class ParkingDisplayBoard {
    private String id;
    private HandicappedSpot handicappedFreeSpot;
    private CompactSpot compactFreeSpot;
    private LargeSpot largeFreeSpot;
    private MotorbikeSpot motorbikeFreeSpot;
    private ElectricSpot electricFreeSpot;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public HandicappedSpot getHandicappedFreeSpot() {
		return this.handicappedFreeSpot;
	}

	public void setHandicappedFreeSpot(HandicappedSpot handicappedFreeSpot) {
		this.handicappedFreeSpot = handicappedFreeSpot;
	}

	public CompactSpot getCompactFreeSpot() {
		return this.compactFreeSpot;
	}

	public void setCompactFreeSpot(CompactSpot compactFreeSpot) {
		this.compactFreeSpot = compactFreeSpot;
	}

	public LargeSpot getLargeFreeSpot() {
		return this.largeFreeSpot;
	}

	public void setLargeFreeSpot(LargeSpot largeFreeSpot) {
		this.largeFreeSpot = largeFreeSpot;
	}

	public MotorbikeSpot getMotorbikeFreeSpot() {
		return this.motorbikeFreeSpot;
	}

	public void setMotorbikeFreeSpot(MotorbikeSpot motorbikeFreeSpot) {
		this.motorbikeFreeSpot = motorbikeFreeSpot;
	}

	public ElectricSpot getElectricFreeSpot() {
		return this.electricFreeSpot;
	}

	public void setElectricFreeSpot(ElectricSpot electricFreeSpot) {
		this.electricFreeSpot = electricFreeSpot;
	}

  
    public void showEmptySpotNumber() {
      String message = "";
      if(handicappedFreeSpot.IsFree()){
        message += "Free Handicapped: " + handicappedFreeSpot.getNumber();
      } else {
        message += "Handicapped is full";
      }
      message += System.lineSeparator();
  
      if(compactFreeSpot.IsFree()){
        message += "Free Compact: " + compactFreeSpot.getNumber();
      } else {
        message += "Compact is full";
      }
      message += System.lineSeparator();
  
      if(largeFreeSpot.IsFree()){
        message += "Free Large: " + largeFreeSpot.getNumber();
      } else {
        message += "Large is full";
      }
      message += System.lineSeparator();
  
      if(motorbikeFreeSpot.IsFree()){
        message += "Free Motorbike: " + motorbikeFreeSpot.getNumber();
      } else {
        message += "Motorbike is full";
      }
      message += System.lineSeparator();
  
      if(electricFreeSpot.IsFree()){
        message += "Free Electric: " + electricFreeSpot.getNumber();
      } else {
        message += "Electric is full";
      }
  
      Show(message);
    }
  }
  