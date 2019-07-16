package ucm.model.dto.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModelCar {
	private String carBrand;
	private String carName;
	private String carColor;
	private String carModel;
	private String carAccident;
	private String carMileage;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("　  브랜드 : ");
		builder.append(carBrand);
		builder.append("　제품명 : ");
		builder.append(carName);
		builder.append("　색상 : ");
		builder.append(carColor);
		builder.append("　연식 : ");
		builder.append(carModel);
		builder.append("　사고유무 : ");
		builder.append(carAccident);
		builder.append("　주행거리 : ");
		builder.append(carMileage);
		return builder.toString();
	}
}
