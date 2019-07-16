package ucm.model.dto.dealer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ucm.model.dto.dealer.ModelDealer;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModelDealer {
	private String businessName;
	private String name;
	private String dealerNumber;
	private String career;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("��  ��ȣ�� : ");
		builder.append(businessName);
		builder.append("�� �̸� : ");
		builder.append(name);
		builder.append("�� �����ѹ� : ");
		builder.append(dealerNumber);
		builder.append("�� ��� : ");
		builder.append(career);
		return builder.toString();
	}
}
