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
		builder.append("　  상호명 : ");
		builder.append(businessName);
		builder.append("　 이름 : ");
		builder.append(name);
		builder.append("　 딜러넘버 : ");
		builder.append(dealerNumber);
		builder.append("　 경력 : ");
		builder.append(career);
		return builder.toString();
	}
}
