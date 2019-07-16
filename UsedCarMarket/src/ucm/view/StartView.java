package ucm.view;

import java.util.Scanner;
import ucm.controller.UcmController;
import ucm.model.dto.Ucm;
import ucm.log.Admin;
import ucm.log.Log4J;
import ucm.model.dto.UcmProject;
import ucm.model.dto.car.Car;
import ucm.model.dto.dealer.Dealer;

public class StartView {

	public static void main(String[] argsvm) {

		// Admin ���� Ȯ�� (log4j)

		System.out.println("ID�� �Է����ּ��� : ");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.next();
		scanner.close();
		if (id.equalsIgnoreCase("admin")) {
			Admin.login();
		} else {
			System.out.println("������ �����ϴ�.");
			return;
		}
		UcmController controller = UcmController.getInstance();

		// ���ο� �����
		Dealer kiamotors = new Dealer("��Ƹ��ͽ�", "������", "Dn125", "46��", "����,���");
		// ���ο� ������
		Car kia = new Car("���", "K7", "black", "2019model", "No", "0km(������)", "3200����");
		// ���ο� ��� ��� ����
		Ucm wwwkiacom = new Ucm("www.kia.com", "�ڡڡڡڡ�", "3��7000��");
		// ���ο� ��� ��� ������Ʈ
		UcmProject newProject = new UcmProject("����,��� �ڵ���", wwwkiacom, kiamotors, kia, "������������1�� ������ ���� AS���񽺼���");

		// ��� ������Ʈ �˻�
		System.out.println("���ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		System.out.println(" �ӡ�����������������������������������������������������	�߰��� �ǸŻ���Ʈ�� ���Ѵ١���������������		������������������������������������������  ��");
		System.out.println(
				" �ӡ����������������������������������������������ѹα� No.1 �߰��� �񱳻���Ʈ ����compare usedcar������������������������������������ ���������������������� ��");
		System.out.println(" �ӡ����������������������������������������������������������������������������������������������������������������������������������� ������������������������������");
		System.out.println("���ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		System.out.println(
				"1**************************************** �߰��� ���� ����Ʈ ��ü ����Ʈ ********************************************************************\n");
		controller.projectListView();

		System.out.println();

		// ���ο� ������Ʈ ����
		System.out.println(
				"2**************************************** �߰��� ���� ����Ʈ �߰��� ��ü ����Ʈ **************************************************************\n");
		controller.insertProject(newProject);
		controller.projectListView();

		System.out.println();

		// �����ϴ� ������Ʈ �˻�
		System.out.println(
				"3-1**************************************** �߰��� ���� ����Ʈ �˻� (KB������) **************************************************************\n");
		controller.projectView("KB������");

		System.out.println();
		System.out.println("***************************** �߰��� ���� ����Ʈ �˻� (����,��� �ڵ���) ********************************************************\n");
		controller.projectView("����,��� �ڵ���");

		System.out.println();
		System.out.println(
				"3-3**************************************** �߰��� ���� ����Ʈ �˻� (Car-Market) ***********************************************************\n");
		controller.projectView("Car-Market");

		System.out.println();
		System.out.println(
				"3-4**************************************** �߰��� ���� ����Ʈ �˻� (�ѱ���������߰���) ******************************************************\n");
		controller.projectView("�ѱ���������߰���");

		System.out.println();
		System.out.println(
				"3-5**************************************** �߰��� ���� ����Ʈ �˻� (����帲) *****************************************************************");
		controller.projectView("����帲");

		System.out.println();
		System.out.println(
				"3-6**************************************** �߰��� ���� ����Ʈ �˻� (SK��ī) *****************************************************************\n");
		controller.projectView("SK��ī");

		System.out.println();
		// �������ϴ� ������Ʈ �˻�
		System.out.println(
				"4**************************************** �߰��� ���� ����Ʈ ���� �����ʴ� �˻� ***************************************************************\n");
		controller.projectView("KS��ī");

		System.out.println();

		// �����ϴ� ������Ʈ ������Ʈ test
		System.out.println(
				"5**************************************** �߰��� ���� ����Ʈ ������ ������ ����Ʈ �˻� ********************************************************\n");
		controller.updateProject("����帲", new Car("���������", "�ƺ�Ÿ����", "yellow", "2018model", "No", "1200km", "4��3õ����"));
		controller.projectView("����帲");
		System.out.println();

		// �� �����ϴ� ������Ʈ ������Ʈ test : ���� �߻�
		System.out.println(
				"6**************************************** �߰��� ���� ����Ʈ ���� ���� �ʴ� ����Ʈ ���� ********************************************************\n");
		controller.updateProject("�ٺ��帲", new Car("���������", "�ƺ�Ÿ����", "yellow", "2018model", "No", "1200km", "4��3õ����"));

		System.out.println();

		// ��� ������Ʈ �˻� �Ǵ� ������ ������Ʈ �˻�
		System.out.println(
				"7**************************************** �߰��� ���� ����Ʈ �����ϴ� ����Ʈ ������ ����Ʈ �˻� ************************************************\n");
		controller.deleteProject("SK��ī");
		controller.projectView("SK��ī");

		// JSON �������� ��ȯ �� ���
		System.out.println(
				"8**************************************** �߰��� ���� ����Ʈ JSON �������� ��ȯ �� ���*******************************************************\n");
		controller.jsonView();
	}
}