package ucm.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ucm.model.dto.dealer.Dealer;
import ucm.model.dto.Ucm;
import ucm.model.dto.UcmProject;
import ucm.model.dto.car.Car;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UcmProject {

	private String ucmProjectName; // 사이트 이름
	private Ucm ucm; // 사이트 주소및 내용
	private Dealer dealer; // 딜러
	private Car car; // 보유차량
	private String projectContent; // 사이트 장단점

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("    사이트 이름 : ");
		builder.append(ucmProjectName);
		builder.append("\n　  사이트 주소 및 내용 \n");
		builder.append(ucm);
		builder.append("\n    딜러 정보\n");
		builder.append(dealer);
		builder.append("\n    딜러 보유차량\n");
		builder.append(car);
		builder.append("\n    사이트 장점 : ");
		builder.append(projectContent);
		return builder.toString();
	}
}
