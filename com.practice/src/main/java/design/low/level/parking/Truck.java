package design.low.level.parking;



public class Truck implements Vehicle{
	private VehicleType type;

	public Truck(VehicleType type) {
		this.type = type;
	}

	@Override
	public VehicleSize getSize() {
		// TODO Auto-generated method stub
		return VehicleSize.LARGE;
	}

	@Override
	public VehicleType getType() {
		// TODO Auto-generated method stub
		return type;
	}
}
