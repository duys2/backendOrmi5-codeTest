package day2;

/*
3개의 정수 인자 a, b, c가 주어졌을 때, 이들의 합을 반환하세요.
하지만, 인자 중 하나가 다른 인자와 동일하면, 그 숫자는 합산에서 제외합니다.
기본적으로 중복되지 않는 숫자만 합산합니다.

System.out.println(sumUnique(1, 2, 3)); // 6
System.out.println(sumUnique(3, 2, 3)); // 2
System.out.println(sumUnique(3, 3, 3)); // 0
*/

public class Question12 {
	public static void main(String[] args) {
		System.out.println(sumUnique(1, 2, 3)); // 6
		System.out.println(sumUnique(3, 2, 3)); // 2
		System.out.println(sumUnique(3, 3, 3)); // 0
	}

	static int sumUnique(int num1, int num2, int num3) {
		// solution
		if (num1 == num2 && num1 == num3)
			return 0;
		if (num1 == num2)
			return num3;
		if (num1 == num3)
			return num2;
		if (num2 == num3)
			return num1;
		return num1 + num2 + num3;
	}
}