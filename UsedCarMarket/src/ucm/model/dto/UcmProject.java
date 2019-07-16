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

	private String ucmProjectName; // ����Ʈ �̸�
	private Ucm ucm; // ����Ʈ �ּҹ� ����
	private Dealer dealer; // ����
	private Car car; // ��������
	private String projectContent; // ����Ʈ �����

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("    ����Ʈ �̸� : ");
		builder.append(ucmProjectName);
		builder.append("\n��  ����Ʈ �ּ� �� ���� \n");
		builder.append(ucm);
		builder.append("\n    ���� ����\n");
		builder.append(dealer);
		builder.append("\n    ���� ��������\n");
		builder.append(car);
		builder.append("\n    ����Ʈ ���� : ");
		builder.append(projectContent);
		return builder.toString();
	}
}
