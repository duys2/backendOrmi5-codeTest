package day2;

/*
세 개의 정수 first, second, third가 주어졌을 때,
second가 first보다 크고 third가 second보다 크면 true를 반환하는 코드를 작성하세요.
단, 마지막 opt 파라미터가 true인 경우에는 second가 first보다 크지 않아도 되지만,
여전히 third보다는 작아야 합니다.

System.out.println(isOrdered(1, 2, 4, false)); // true
System.out.println(isOrdered(1, 2, 1, false)); // false
System.out.println(isOrdered(1, 1, 2, true));  // true
*/

public class Question9 {
	public static void main(String[] args) {
		System.out.println(isOrdered(1, 2, 4, false)); // true
		System.out.println(isOrdered(1, 2, 1, false)); // false
		System.out.println(isOrdered(1, 1, 2, true));  // true
	}

	static boolean isOrdered(int first, int second, int third, boolean opt) {
		// if ((!opt && first < second && second < third) || (opt && second < third)) {
		// 	return true;
		// } else {
		// 	return false;
		// }

		/*solution*/
		// if (opt) {
		// 	return second < third;
		// }
		// return (first < second) && (second < third);

		return opt ? second < third : (first < second) && (second < third);
	}
}