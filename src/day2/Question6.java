package day2;

/*
문자열 데이터를 전달 받으면 각각의 문자열 사이에 @ 표시를 집어 넣는 함수를 만들어 봅니다.
단, 재귀 함수를 이용하여 풀어보세요.
*/

public class Question6 {
	public static void main(String[] args) {
		System.out.println(printAt("hello")); // "h@e@l@l@o"
		System.out.println(printAt("Hello World"));
	}

	static String printAt(String str) {
		// solution

		// while문으로
		int i = 0;
		String result = "";

		if (str.length() <= i) {
			result = str;
		}

		while (i < str.length() - 1) {
			result += str.charAt(i) + "@";
			i++;
		}

		result += str.charAt(i);

		return result;

		/*
		if (str.length() <= 1) {
			return str;
		}

		// str.charAt(0) + "@" + str.charAt(1) + "@" + str.charAt(2) + "@" ...
		return str.charAt(0) + "@" + printAt(str.substring(1));
		*/
	}
}
