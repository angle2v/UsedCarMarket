package ucm.view;

import java.util.ArrayList;

import ucm.model.dto.UcmProject;

public class EndView {

	// 특정 프로젝트 출력
	public static void projectView(UcmProject project) {
		System.out.println(project);
	}

	// 모든 프로젝트 출력
	public static void projectListView(ArrayList<UcmProject> allUcmProject) {
		for (int index = 0; index < allUcmProject.size(); index++) {
			System.out.println("  \"중고차 구매사이트 " + (index + 1) + "\"\n" + allUcmProject.get(index) + "\n");
		}
	}

	// 예외가 아닌 단순 메세지 출력
	public static void messageView(String message) {
		System.out.println(message);
	}

}
