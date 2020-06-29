package design.low.level.parking;

import design.low.level.parking.Vehicle.VehicleSize;
import design.low.level.parking.Vehicle.VehicleType;

public class ParkingSpace {
	private VehicleSize vehicleSize;
	private VehicleType type;
	private boolean isTaken;

	public ParkingSpace(VehicleSize vehicleSize, VehicleType type) {
		this.vehicleSize = vehicleSize;
		this.type = type;
	}
	
	public void setIsTaken(boolean isTaken) {
		this.isTaken=isTaken;
	}
	
	public boolean getIsTaken() {
		return this.isTaken;
	}
	public VehicleSize getSize() {
		return this.vehicleSize;
	}
	
	public VehicleType getType() {
		return this.type;
	}
}
