//DB가 없는 관계로 test용 데이터 제공 클래스
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
		projectList.add(new UcmProject("보배드림", new Ucm("http://www.bobaedream.co.kr/", "★★★★☆", "4만5000대"),
				new Dealer("UsedCarMoter", "양세형", "Dn165486", "17년", "BMW,Benz"),
				new Car("BMW", "520i", "white", "2017model", "No", "6700km", "5300만원"), "국내 사이트중 가장 많은 차량 보유"));

		projectList.add(new UcmProject("SK엔카", new Ucm("http://www.encar.com/index.do", "★★☆☆☆", "1만9000대"),
				new Dealer("대성모터스", "박찬호", "Dn65254", "3년", "현대,기아"),
				new Car("제네시스", "EQ900", "black", "2016model", "No", "60000km", "5350만원"), "차량 가격공개 가격선은 높은편 "));

		projectList.add(new UcmProject("KB차차차", new Ucm("https://www.kbchachacha.com/", "★★★☆☆", "2만400대"),
				new Dealer("코오롱오토모티브", "장동건", "Dn64964", "1년", "롤스로이스,벤틀리"),
				new Car("롤스로이스", "고스트V12", "gray", "2013model", "Yes[내차 피해1회]", "46000km", "19700만원"), "20만원 헛걸음 보상제"));

		projectList.add(new UcmProject("Car-Market", new Ucm("http://www.car-market.co.kr/", "★★☆☆☆", "1만470대"),
				new Dealer("한독모터스", "김정은", "Dn22315", "22년", "평화자동차,화타이자동차"),
				new Car("평화자동차", "휘파람Ⅲ", "white", "2010model", "No", "90000km", "1200만원"), "타 사이트 대비 가격대 저렴"));

		projectList.add(new UcmProject("한국법원경매중고차", new Ucm("http://jc-clean.co.kr", "★★★☆☆", "3만3000대"),
				new Dealer("세광모터스", "곽한구", "Dn86524", "1년", "포르쉐,멕라렌"),
				new Car("포르쉐", "뉴카이맨", "black", "2016model", "Yes[내차 피해1회]", "7000km", "8350만원"),
				"회사부도 차량 저렴하게 구매 가능성"));
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