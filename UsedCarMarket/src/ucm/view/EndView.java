package ucm.view;

import java.util.ArrayList;

import ucm.model.dto.UcmProject;

public class EndView {

	// Ư�� ������Ʈ ���
	public static void projectView(UcmProject project) {
		System.out.println(project);
	}

	// ��� ������Ʈ ���
	public static void projectListView(ArrayList<UcmProject> allUcmProject) {
		for (int index = 0; index < allUcmProject.size(); index++) {
			System.out.println("  \"�߰��� ���Ż���Ʈ " + (index + 1) + "\"\n" + allUcmProject.get(index) + "\n");
		}
	}

	// ���ܰ� �ƴ� �ܼ� �޼��� ���
	public static void messageView(String message) {
		System.out.println(message);
	}

}
