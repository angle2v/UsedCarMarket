package ucm.model.dto.car;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Car extends ModelCar {
	private String carPrice;

	public Car(String carBrand, String carName, String carColor, String carModel, String carAccident, String carMileage,
			String carPrice) {
		super(carBrand, carName, carColor, carModel, carAccident, carMileage);
		this.carPrice = carPrice;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("　차량가격 : ");
		builder.append(carPrice);
		return builder.toString();
	}
}
