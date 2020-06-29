package design.low.level.parking;

public interface Vehicle {
	enum VehicleSize {
		SMALL, MEDIUM, LARGE,
	}

	enum VehicleType {
		REGULAR, HANDICAPPED
	}

	VehicleSize getSize();

	VehicleType getType();
}
