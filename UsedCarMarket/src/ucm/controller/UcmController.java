package ucm.controller;

import java.util.ArrayList;

import net.sf.json.JSONObject;
import ucm.exception.NotExistException;
import ucm.model.dto.car.ModelCar;
import ucm.model.dto.UcmProject;
import ucm.service.UcmProjectService;
import ucm.view.EndView;
import ucm.view.FailView;

public class UcmController {

	private static UcmController instance = new UcmController();
	private UcmProjectService service = UcmProjectService.getInstance();

	private UcmController() {
	}

	public static UcmController getInstance() {
		return instance;
	}

	// 모든 프로젝트 검색
	public void projectListView() {
		ArrayList<UcmProject> projectList = service.getAllProjects();
		if (projectList.size() != 0) {
			EndView.projectListView(projectList);
		} else {
			EndView.messageView("검색하신 사이트는 존재하지 않습니다.");
		}
	}

	// 특정 프로젝트 검색
	public void projectView(String ucmName) {
		UcmProject project = service.getUcmProject(ucmName);
		if (project != null) {
			EndView.projectView(project);
		} else {
			EndView.messageView("\n　　　　　　　　　　　　　　　　　　　　　　　　　　　　검색 요청하신 사이트가 존재하지 않습니다.\n");
		}
	}

	// 새로운 프로젝트 저장
	public void insertProject(UcmProject newProject) {
		service.projectInsert(newProject);
	}

	// 존재하는 프로젝트 수정
	public void updateProject(String projectName, ModelCar car) {
		try {
			service.projectUpdate(projectName, car);
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
			e.printStackTrace();
		}
	}

	// 존재하는 프로젝트 삭제
	public void deleteProject(String projectName) {
		try {
			service.projectDelete(projectName);
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
			e.printStackTrace();
		}
	}

	// 프로젝트명을 키값으로 하는 JSON객체 생성
	public void jsonView() {
		ArrayList<UcmProject> projectList = service.getAllProjects();
		JSONObject jsonObject = new JSONObject();
		for (UcmProject p : projectList) {
			jsonObject.put(p.getUcmProjectName(), JSONObject.fromObject(p));
		}
		System.out.println(jsonObject);
	}
}