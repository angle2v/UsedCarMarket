package ucm.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ucm {
	private String ucmAd;// ���� ����Ʈ �ּ�
	private String ucmCS;// ���� �� ������
	private String ucmSupply;// ���� ���� ������(Ȱ�� ����)

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("��  ����Ʈ�ּ� : ");
		builder.append(ucmAd);
		builder.append("�������������������� : ");
		builder.append(ucmCS);
		builder.append("���������������� ������ : ");
		builder.append(ucmSupply);
		return builder.toString();
	}
}