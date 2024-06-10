package day2;

/*
주어진 문자열에서 각 문자마다 동일한 문자를 한 번 더 추가한 문자열을 반환하세요.

System.out.println(repeatChar("The")); // "TThhee"
System.out.println(repeatChar("AAbb")); // "AAAAbbbb"
System.out.println(repeatChar("Hi-There")); // "HHii--TThheerree"
*/

public class Question13 {
	public static void main(String[] args) {
		System.out.println(repeatChar("The")); // "TThhee"
		System.out.println(repeatChar("AAbb")); // "AAAAbbbb"
		System.out.println(repeatChar("Hi-There")); // "HHii--TThheerree"
	}

	static String repeatChar(String str) {
		/*
		if (str == null || str.isEmpty()) { // isEmpty(): 길이가 0이면 true 반환
			return "";
		}
		*/

		/*
		if (str == null || str.length() == 0) {
			return "";
		}

		String s = String.valueOf(str.charAt(0));

		return s + s + repeatChar(str.substring(1));
		*/

		// solution
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char theChar = str.charAt(i);
			// result += theChar + theChar; // char 자료형이라서 유니코드로 연산됨

			// 아래에서 흐리게 나오는 건 메소드를 너무 많이 써서 (둘 중 하나만 해도 자동 형변환이 됨)
			// result += Character.toString(theChar) + String.valueOf(theChar);
			result += "" + theChar + theChar; // 메소드를 안 쓰려면 빈 문자열 더하기
		}

		return result;
	}
}