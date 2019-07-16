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

	// 모든 Project 반환
	public ArrayList<UcmProject> getAllProjects() {
		return projectVirtualData.getProjectList();
	}

	// Project 검색
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

	// Project 추가
	public void projectInsert(UcmProject project) {
		projectVirtualData.insertProject(project);
	}

	// Project 수정 - 프로젝트 명으로 재능 기부자 또는 수혜자 수정
	public void projectUpdate(String projectName, ModelCar car) throws NotExistException {
		UcmProject project = getUcmProject(projectName);

		if (project == null) {
			throw new NotExistException("　　　　　　　　　　　　　　　　　　　　　　　　　　　　　수정하고자 하는 사이트가 존재하지 않습니다.\n ");
		} else if (car instanceof Car) {
			project.setCar((Car) car);
		} else if (car instanceof Car) {
			project.setCar((Car) car);
		}
		projectVirtualData.insertProject(project);
	}

	// Project 삭제
	public void projectDelete(String projectName) throws NotExistException {
		UcmProject project = getUcmProject(projectName);
		if (project == null) {
			throw new NotExistException("검색 요청하신 사이트가 존재하지 않습니다.");
		}
		;
		projectVirtualData.deleteProject(project);
	}
}