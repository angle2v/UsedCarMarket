package ucm.log;

import ucm.log.Log4J;

public class Log4J {
	private static Log4J instance = new Log4J();

	private Log4J() {
	}

	public static Log4J getInstatnce() {
		return instance;
	}

	public String info() {
		return " CompareUsedCar에 오신것을 환영합니다^.^ ";
	}

	public String warn() {
		return " 권한이 없습니다 ";
	}
}
