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
		builder.append("��  �귣�� : ");
		builder.append(carBrand);
		builder.append("����ǰ�� : ");
		builder.append(carName);
		builder.append("������ : ");
		builder.append(carColor);
		builder.append("������ : ");
		builder.append(carModel);
		builder.append("��������� : ");
		builder.append(carAccident);
		builder.append("������Ÿ� : ");
		builder.append(carMileage);
		return builder.toString();
	}
}
