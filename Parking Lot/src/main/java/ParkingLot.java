public class ParkingLot {
    private String name;
    private Location address;
    private ParkingRate parkingRate;
  
    private int largeSpotCount;
    private final int maxLargeCount;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getAddress() {
		return this.address;
	}

	public void setAddress(Location address) {
		this.address = address;
	}

	public ParkingRate getParkingRate() {
		return this.parkingRate;
	}

	public void setParkingRate(ParkingRate parkingRate) {
		this.parkingRate = parkingRate;
	}

	public int getLargeSpotCount() {
		return this.largeSpotCount;
	}

	public void setLargeSpotCount(int largeSpotCount) {
		this.largeSpotCount = largeSpotCount;
	}

  
    private HashMap<String, EntrancePanel> entrancePanels;
    private HashMap<String, ExitPanel> exitPanels;
    private HashMap<String, ParkingFloor> parkingFloors;
  
    // all active parking tickets, identified by their ticketNumber
    private HashMap<String, ParkingTicket> activeTickets;
  
    // singleton ParkingLot to ensure only one object of ParkingLot in the system,
    // all entrance panels will use this object to create new parking ticket: getNewParkingTicket(),
    // similarly exit panels will also use this object to close parking tickets
    private static ParkingLot parkingLot = null;
  
    // private constructor to restrict for singleton
    private ParkingLot() {
      // 1. initialize variables: read name, address and parkingRate from database
      // 2. initialize parking floors: read the parking floor map from database,
      //  this map should tell how many parking spots are there on each floor. This
      //  should also initialize max spot counts too.
      // 3. initialize parking spot counts by reading all active tickets from database
      // 4. initialize entrance and exit panels: read from database
    }
  
    // static method to get the singleton instance of StockExchange
    public static ParkingLot getInstance() {
      if (parkingLot == null) {
        parkingLot = new ParkingLot();
      }
      return parkingLot;
    }
  
    // note that the following method is 'synchronized' to allow multiple entrances
    // panels to issue a new parking ticket without interfering with each other
    public synchronized ParkingTicket getNewParkingTicket(Vehicle vehicle) throws ParkingFullException {
      if (this.isFull(vehicle.getType())) {
        throw new ParkingFullException();
      }
      ParkingTicket ticket = new ParkingTicket();
      vehicle.assignTicket(ticket);
      ticket.saveInDB();
      // if the ticket is successfully saved in the database, we can increment the parking spot count
      this.incrementSpotCount(vehicle.getType());
      this.activeTickets.put(ticket.getTicketNumber(), ticket);
      return ticket;
    }
  
    public boolean isFull(VehicleType type) {
    return largeSpotCount >= maxLargeCount;
    }

    // increment the parking spot count based on the vehicle type
    private boolean incrementSpotCount(VehicleType type) {
      largeSpotCount++;
    }
  
    public boolean isFull() {
      for (String key : parkingFloors.keySet()) {
        if (!parkingFloors.get(key).isFull()) {
          return false;
        }
      }
      return true;
    }
  
    public void addParkingFloor(ParkingFloor floor) {
      /* store in database */ }
  
    public void addEntrancePanel(EntrancePanel entrancePanel) {
      /* store in database */ }
  
    public void addExitPanel(ExitPanel exitPanel) {
      /* store in database */ }
  }
  