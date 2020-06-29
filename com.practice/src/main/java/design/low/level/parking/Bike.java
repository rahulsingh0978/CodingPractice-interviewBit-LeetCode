package design.low.level.parking;


public class Bike implements Vehicle {
	private VehicleType type;

	public Bike(VehicleType type) {
		this.type = type;
	}

	@Override
	public VehicleSize getSize() {
		// TODO Auto-generated method stub
		return VehicleSize.SMALL;
	}

	@Override
	public VehicleType getType() {
		// TODO Auto-generated method stub
		return type;
	}

}
