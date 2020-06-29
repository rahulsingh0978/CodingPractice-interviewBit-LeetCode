package design.low.level.parking;

public class Car implements Vehicle {
		private VehicleType type;

		public Car(VehicleType type) {
			this.type = type;
		}

		@Override
		public VehicleSize getSize() {
			// TODO Auto-generated method stub
			return VehicleSize.MEDIUM;
		}

		@Override
		public VehicleType getType() {
			// TODO Auto-generated method stub
			return type;
		}
}
