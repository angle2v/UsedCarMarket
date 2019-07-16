package ucm.model.dto.dealer;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Dealer extends ModelDealer {
	private String major;

	public Dealer(String businessName, String name, String dealerNumber, String career, String major) {
		super(businessName, name, dealerNumber, career);
		this.major = major;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("　전문 차량 브랜드 : ");
		builder.append(major);
		return builder.toString();
	}

}