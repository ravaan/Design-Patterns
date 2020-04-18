public abstract class Vehicle {
    private String licenseNumber;
    private final VehicleType type;
    private ParkingTicket ticket;

	public String getLicenseNumber() {
		return this.licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
  
    public Vehicle(VehicleType type) {
      this.type = type;
    }
  
    public void assignTicket(ParkingTicket ticket) {
      this.ticket = ticket;
    }
  }
  
  // Similarly we can define classes for Motorcycle and Electric vehicles