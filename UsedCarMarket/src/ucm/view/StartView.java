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

		// Admin 권한 확인 (log4j)

		System.out.println("ID를 입력해주세요 : ");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.next();
		scanner.close();
		if (id.equalsIgnoreCase("admin")) {
			Admin.login();
		} else {
			System.out.println("권한이 없습니다.");
			return;
		}
		UcmController controller = UcmController.getInstance();

		// 새로운 기부자
		Dealer kiamotors = new Dealer("기아모터스", "정몽준", "Dn125", "46년", "현대,기아");
		// 새로운 수혜자
		Car kia = new Car("기아", "K7", "black", "2019model", "No", "0km(새차량)", "3200만원");
		// 새로운 재능 기부 내용
		Ucm wwwkiacom = new Ucm("www.kia.com", "★★★★☆", "3만7000대");
		// 새로운 재능 기부 프로젝트
		UcmProject newProject = new UcmProject("현대,기아 자동차", wwwkiacom, kiamotors, kia, "국산차점유율1위 유지비가 저렴 AS서비스수월");

		// 모든 프로젝트 검색
		System.out.println("ㅏㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅓ");
		System.out.println(" ㅣ　　　　　　　　　　　　　　　　　　　　　　　　　　　	중고차 판매사이트를 비교한다　　　　　　　　		　　　　　　　　　　　　　　　　　　　　　  ㅣ");
		System.out.println(
				" ㅣ　　　　　　　　　　　　　　　　　　　　　　대한민국 No.1 중고차 비교사이트 　『compare usedcar』　　　　　　　　　　　　　　　　　 　　　　　　　　　　　 ㅣ");
		System.out.println(" ㅣ　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　 　　　　　　　　　　　　　　ㅣ");
		System.out.println("ㅏㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅓ");
		System.out.println(
				"1**************************************** 중고차 구매 사이트 전체 리스트 ********************************************************************\n");
		controller.projectListView();

		System.out.println();

		// 새로운 프로젝트 저장
		System.out.println(
				"2**************************************** 중고차 구매 사이트 추가후 전체 리스트 **************************************************************\n");
		controller.insertProject(newProject);
		controller.projectListView();

		System.out.println();

		// 존재하는 프로젝트 검색
		System.out.println(
				"3-1**************************************** 중고차 구매 사이트 검색 (KB차차차) **************************************************************\n");
		controller.projectView("KB차차차");

		System.out.println();
		System.out.println("***************************** 중고차 구매 사이트 검색 (현대,기아 자동차) ********************************************************\n");
		controller.projectView("현대,기아 자동차");

		System.out.println();
		System.out.println(
				"3-3**************************************** 중고차 구매 사이트 검색 (Car-Market) ***********************************************************\n");
		controller.projectView("Car-Market");

		System.out.println();
		System.out.println(
				"3-4**************************************** 중고차 구매 사이트 검색 (한국법원경매중고차) ******************************************************\n");
		controller.projectView("한국법원경매중고차");

		System.out.println();
		System.out.println(
				"3-5**************************************** 중고차 구매 사이트 검색 (보배드림) *****************************************************************");
		controller.projectView("보배드림");

		System.out.println();
		System.out.println(
				"3-6**************************************** 중고차 구매 사이트 검색 (SK엔카) *****************************************************************\n");
		controller.projectView("SK엔카");

		System.out.println();
		// 미존재하는 프로젝트 검색
		System.out.println(
				"4**************************************** 중고차 구매 사이트 존재 하지않는 검색 ***************************************************************\n");
		controller.projectView("KS엔카");

		System.out.println();

		// 존재하는 프로젝트 업데이트 test
		System.out.println(
				"5**************************************** 중고차 구매 사이트 수정후 수정한 사이트 검색 ********************************************************\n");
		controller.updateProject("보배드림", new Car("람보르기니", "아벤타도르", "yellow", "2018model", "No", "1200km", "4억3천만원"));
		controller.projectView("보배드림");
		System.out.println();

		// 미 존재하는 프로젝트 업데이트 test : 예외 발생
		System.out.println(
				"6**************************************** 중고차 구매 사이트 존재 하지 않는 사이트 수정 ********************************************************\n");
		controller.updateProject("바보드림", new Car("람보르기니", "아벤타도르", "yellow", "2018model", "No", "1200km", "4억3천만원"));

		System.out.println();

		// 모든 프로젝트 검색 또는 삭제한 프로젝트 검색
		System.out.println(
				"7**************************************** 중고차 구매 사이트 존재하는 사이트 삭제후 사이트 검색 ************************************************\n");
		controller.deleteProject("SK엔카");
		controller.projectView("SK엔카");

		// JSON 형식으로 변환 및 출력
		System.out.println(
				"8**************************************** 중고차 구매 사이트 JSON 형식으로 변환 및 출력*******************************************************\n");
		controller.jsonView();
	}
}