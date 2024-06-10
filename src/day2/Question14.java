package day2;

/*
주어진 문자열에서 모든 별표()와 별표 바로 왼쪽 및 오른쪽에 있는 문자를 제거한 버전을 반환하세요.
예를 들어, "abcd"는 "ad"를 반환하고, "ab**cd"도 "ad"를 반환합니다.

System.out.println(starSideDel("cd*zq")); // "cq"
System.out.println(starSideDel("ab**cd")); // "ad"
System.out.println(starSideDel("wacy*xko")); // "wacko"
*/

public class Question14 {
	public static void main(String[] args) {
		System.out.println(starSideDel("cd*zq")); // "cq"
		System.out.println(starSideDel("ab**cd")); // "ad"
		System.out.println(starSideDel("wacy*xko")); // "wacko"
		System.out.println(starSideDel("ab*xko"));
		System.out.println(starSideDel("ab*xko*"));
	}

	static String starSideDel(String s) {
		/*
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '*') {
				count++;
			}
		}

		if (count == 1) {
			String[] sings = s.split("\\*"); // regex: 정규 표현식
			return sings[0].subsing(0, sings[0].length() - 1) + sings[1].subsing(1);
		}
		if (count == 2) {
			String[] sings = s.split("\\*\\*");
			return sings[0].subsing(0, sings[0].length() - 1) + sings[1].subsing(1);
		}
		return "";
		*/

		/* solution */
		String result = "";

		for (int i = 0; i < s.length(); i++) {

			// 현재 문자가 *인 경우
			if (s.charAt(i) == '*') {
				// 두번 건너뛰도록 만들겠습니다.
				i++;
				continue;
			}

			// 현재 문자가 *이 아닌 경우
			if ((i == 0 || s.charAt(i - 1) != '*') && (i == s.length() - 1 || s.charAt(i + 1) != '*')) {
				result += String.valueOf(s.charAt(i));
			}
			/*
			if (i == 0 && s.charAt(i) != '*') {
				result += String.valueOf(s.charAt(i));
			}

			if (i > 0 && s.charAt(i) != '*' && s.charAt(i - 1) != '*') {
				result += String.valueOf(s.charAt(i));
			}

			if (i > 0 && s.charAt(i) == '*' && s.charAt(i - 1) != '*') {
				result = result.subsing(0, result.length() - 1);
			}
			*/
		}

		return result;
	}
}