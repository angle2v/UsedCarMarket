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

	// ��� ������Ʈ �˻�
	public void projectListView() {
		ArrayList<UcmProject> projectList = service.getAllProjects();
		if (projectList.size() != 0) {
			EndView.projectListView(projectList);
		} else {
			EndView.messageView("�˻��Ͻ� ����Ʈ�� �������� �ʽ��ϴ�.");
		}
	}

	// Ư�� ������Ʈ �˻�
	public void projectView(String ucmName) {
		UcmProject project = service.getUcmProject(ucmName);
		if (project != null) {
			EndView.projectView(project);
		} else {
			EndView.messageView("\n���������������������������������������������������������˻� ��û�Ͻ� ����Ʈ�� �������� �ʽ��ϴ�.\n");
		}
	}

	// ���ο� ������Ʈ ����
	public void insertProject(UcmProject newProject) {
		service.projectInsert(newProject);
	}

	// �����ϴ� ������Ʈ ����
	public void updateProject(String projectName, ModelCar car) {
		try {
			service.projectUpdate(projectName, car);
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
			e.printStackTrace();
		}
	}

	// �����ϴ� ������Ʈ ����
	public void deleteProject(String projectName) {
		try {
			service.projectDelete(projectName);
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
			e.printStackTrace();
		}
	}

	// ������Ʈ���� Ű������ �ϴ� JSON��ü ����
	public void jsonView() {
		ArrayList<UcmProject> projectList = service.getAllProjects();
		JSONObject jsonObject = new JSONObject();
		for (UcmProject p : projectList) {
			jsonObject.put(p.getUcmProjectName(), JSONObject.fromObject(p));
		}
		System.out.println(jsonObject);
	}
}