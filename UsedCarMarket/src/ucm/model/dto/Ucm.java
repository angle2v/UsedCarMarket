package ucm.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ucm {
	private String ucmAd;// 마켓 사이트 주소
	private String ucmCS;// 마켓 고객 만족도
	private String ucmSupply;// 마켓 차량 보유량(활동 영역)

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("　  사이트주소 : ");
		builder.append(ucmAd);
		builder.append("　　　　　　고객만족도 : ");
		builder.append(ucmCS);
		builder.append("　　　　　　차량 보유량 : ");
		builder.append(ucmSupply);
		return builder.toString();
	}
}