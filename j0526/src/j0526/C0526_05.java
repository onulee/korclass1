package j0526;

public class C0526_05 {

	public static void main(String[] args) {
		String str1 = "곽상도 전 국민의힘 의원의 ‘50억 수수 의혹’을 수사하고 있는 검찰이 하나금융지주를 압수수색했습니다.\r\n"
				+ "서울중앙지검 반부패수사3부(부장검사 강백신)는 오늘(26일) 오전부터 하나금융지주와 하나은행 금융투자센터 사무실 등에 대해 압수수색을 진행하고 있습니다.\r\n"
				+ "곽상도 전 의원의 뇌물 혐의에 대한 1심 무죄 판결 뒤 검찰이 하나은행을 압수수색하는 건 오늘이 처음입니다.\r\n"
				+ "검찰은 하나은행 등에서 대장동 사업 컨소시엄 구성과 관련한 자료를 확보하는 것으로 전해졌습니다.\r\n"
				+ "검찰은 대장동 개발 사업 공모가 있었던 2015년, 산업은행 컨소시엄에 참여한 호반건설이 하나은행에 성남의뜰 컨소시엄 이탈을 제안하자, 화천대유 대주주 김만배 씨 부탁을 받은 곽 전 의원이 하나은행에 영향력을 행사해 이를 막아준 것으로 의심하고 있습니다.\r\n"
				+ "곽 전 의원은 이 과정에서 그 대가로 아들 병채 씨의 퇴직금 명목으로 50억 원을 받은 혐의를 받고 있습니다.\r\n"
				+ "지난해 검찰은 뇌물과 알선수재 혐의로 곽 전 의원을 재판에 넘겼지만, 1심 재판부는 곽 전 의원의 뇌물 혐의에 대해 “하나은행의 이탈 위기가 존재했다고 단정하기 어렵고, 곽 전 의원이 실제로 하나금융지주에 영향력을 행사했다고 보기 어렵다”며 지난 2월 무죄를 선고했습니다.\r\n"
				+ "검찰은 이 같은 판결에 항소한 뒤 보강 수사를 진행해 왔습니다.";
		String str2 = "곽상도 전 국민의힘 의원의 ‘50억 수수 의혹’을 수사하고 있는 검찰이 하나금융지주를 압수수색했습니다.\r\n"
				+ "서울중앙지검 반부패수사3부(부장검사 강백신)는 오늘(26일) 오전부터 하나금융지주와 하나은행 금융투자센터 사무실 등에 대해 압수수색을 진행하고 있습니다.\r\n"
				+ "곽상도 전 의원의 뇌물 혐의에 대한 1심 무죄 판결 뒤 검찰이 하나은행을 압수수색하는 건 오늘이 처음입니다.\r\n"
				+ "검찰은 하나은행 등에서 대장동 사업 컨소시엄 구성과 관련한 자료를 확보하는 것으로 전해졌습니다.\r\n"
				+ "검찰은 대장동 개발 사업 공모가 있었던 2015년, 산업은행 컨소시엄에 참여한 호반건설이 하나은행에 성남의뜰 컨소시엄 이탈을 제안하자, 화천대유 대주주 김만배 씨 부탁을 받은 곽 전 의원이 하나은행에 영향력을 행사해 이를 막아준 것으로 의심하고 있습니다.\r\n"
				+ "곽 전 의원은 이 과정에서 그 대가로 아들 병채 씨의 퇴직금 명목으로 50억 원을 받은 혐의를 받고 있습니다.\r\n"
				+ "지난해 검찰은 뇌물과 알선수재 혐의로 곽 전 의원을 재판에 넘겼지만, 1심 재판부는 곽 전 의원의 뇌물 혐의에 대해 “하나은행의 이탈 위기가 존재했다고 단정하기 어렵고, 곽 전 의원이 실제로 하나금융지주에 영향력을 행사했다고 보기 어렵다”며 지난 2월 무죄를 선고했습니다.\r\n"
				+ "검찰은 이 같은 판결에 항소한 뒤 보강 수사를 진행해 왔습니다.";
		
		if(str1.equals(str2)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		
		
		System.out.println("hashcode str1 : "+str1.hashCode());
		System.out.println("hashcode str2 : "+str2.hashCode());

	}

}
