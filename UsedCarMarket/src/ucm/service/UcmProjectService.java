package ucm.service;

import java.util.ArrayList;

import ucm.exception.NotExistException;
import ucm.model.UcmModelVirtualDB;
import ucm.model.dto.car.Car;
import ucm.model.dto.car.ModelCar;
import ucm.model.dto.UcmProject;

public class UcmProjectService {

	private static UcmProjectService instance = new UcmProjectService();
	private UcmModelVirtualDB projectVirtualData = UcmModelVirtualDB.getInstance();

	private UcmProjectService() {
	}

	public static UcmProjectService getInstance() {
		return instance;
	}

	// ��� Project ��ȯ
	public ArrayList<UcmProject> getAllProjects() {
		return projectVirtualData.getProjectList();
	}

	// Project �˻�
	public UcmProject getUcmProject(String projectName) {
		UcmProject project = null;
		ArrayList<UcmProject> allProjects = projectVirtualData.getProjectList();
		for (UcmProject p : allProjects) {
			if (p != null && p.getUcmProjectName().equals(projectName)) {
				return p;
			}
		}
		return project;
	}

	// Project �߰�
	public void projectInsert(UcmProject project) {
		projectVirtualData.insertProject(project);
	}

	// Project ���� - ������Ʈ ������ ��� ����� �Ǵ� ������ ����
	public void projectUpdate(String projectName, ModelCar car) throws NotExistException {
		UcmProject project = getUcmProject(projectName);

		if (project == null) {
			throw new NotExistException("���������������������������������������������������������������ϰ��� �ϴ� ����Ʈ�� �������� �ʽ��ϴ�.\n ");
		} else if (car instanceof Car) {
			project.setCar((Car) car);
		} else if (car instanceof Car) {
			project.setCar((Car) car);
		}
		projectVirtualData.insertProject(project);
	}

	// Project ����
	public void projectDelete(String projectName) throws NotExistException {
		UcmProject project = getUcmProject(projectName);
		if (project == null) {
			throw new NotExistException("�˻� ��û�Ͻ� ����Ʈ�� �������� �ʽ��ϴ�.");
		}
		;
		projectVirtualData.deleteProject(project);
	}
}