//DB�� ���� ����� test�� ������ ���� Ŭ����
package ucm.model;

import java.util.ArrayList;

import ucm.model.dto.car.Car;
import ucm.model.dto.dealer.Dealer;
import ucm.model.dto.Ucm;
import ucm.model.dto.UcmProject;

public class UcmModelVirtualDB {
	private static UcmModelVirtualDB instance = new UcmModelVirtualDB();
	private ArrayList<UcmProject> projectList = new ArrayList<UcmProject>();

	private UcmModelVirtualDB() {
		projectList.add(new UcmProject("����帲", new Ucm("http://www.bobaedream.co.kr/", "�ڡڡڡڡ�", "4��5000��"),
				new Dealer("UsedCarMoter", "�缼��", "Dn165486", "17��", "BMW,Benz"),
				new Car("BMW", "520i", "white", "2017model", "No", "6700km", "5300����"), "���� ����Ʈ�� ���� ���� ���� ����"));

		projectList.add(new UcmProject("SK��ī", new Ucm("http://www.encar.com/index.do", "�ڡڡ١١�", "1��9000��"),
				new Dealer("�뼺���ͽ�", "����ȣ", "Dn65254", "3��", "����,���"),
				new Car("���׽ý�", "EQ900", "black", "2016model", "No", "60000km", "5350����"), "���� ���ݰ��� ���ݼ��� ������ "));

		projectList.add(new UcmProject("KB������", new Ucm("https://www.kbchachacha.com/", "�ڡڡڡ١�", "2��400��"),
				new Dealer("�ڿ��տ����Ƽ��", "�嵿��", "Dn64964", "1��", "�ѽ����̽�,��Ʋ��"),
				new Car("�ѽ����̽�", "��ƮV12", "gray", "2013model", "Yes[���� ����1ȸ]", "46000km", "19700����"), "20���� ����� ������"));

		projectList.add(new UcmProject("Car-Market", new Ucm("http://www.car-market.co.kr/", "�ڡڡ١١�", "1��470��"),
				new Dealer("�ѵ����ͽ�", "������", "Dn22315", "22��", "��ȭ�ڵ���,ȭŸ���ڵ���"),
				new Car("��ȭ�ڵ���", "���Ķ���", "white", "2010model", "No", "90000km", "1200����"), "Ÿ ����Ʈ ��� ���ݴ� ����"));

		projectList.add(new UcmProject("�ѱ���������߰���", new Ucm("http://jc-clean.co.kr", "�ڡڡڡ١�", "3��3000��"),
				new Dealer("�������ͽ�", "���ѱ�", "Dn86524", "1��", "������,�߶�"),
				new Car("������", "��ī�̸�", "black", "2016model", "Yes[���� ����1ȸ]", "7000km", "8350����"),
				"ȸ��ε� ���� �����ϰ� ���� ���ɼ�"));
	}

	public static UcmModelVirtualDB getInstance() {
		return instance;
	}

	public ArrayList<UcmProject> getProjectList() {
		return projectList;
	}

	public void insertProject(UcmProject newProject) {
		projectList.add(newProject);
	}

	public void deleteProject(UcmProject project) {
		projectList.remove(project);
	}
}