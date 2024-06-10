package day2;

/*
경찰이 당신을 과속으로 잡았을 때 내야 할 벌금을 계산하는 코드를 작성해보겠습니다.
만약 당신의 속도가 60 이하라면 벌금은 없습니다.
속도가 61에서 80 사이(포함)라면 벌금은 100원입니다.
속도가 81 이상이라면 벌금은 200원입니다.
단, 휴일인 경우 속도 한도가 5 더 높아집니다.

속도가 60 이하라면 벌금은 0원입니다.
속도가 61 이상이라면 벌금은 100원입니다.
만약 휴일이라면 속도가 65라도 벌금은 0원입니다.
*/

public class Question7 {
	public static void main(String[] args) {
		System.out.println(speedRacer(100, false)); // 200
		System.out.println(speedRacer(70, false)); // 100
		System.out.println(speedRacer(59, false)); // 0
		System.out.println(speedRacer(80, true)); // 100
		System.out.println(speedRacer(63, true)); // 0
		System.out.println(speedRacer(85, true)); // 100
		System.out.println(speedRacer(99, true)); // 200
	}

	static int speedRacer(int speed, boolean isHoliday) {
		int fine = 0;

		if (isHoliday) {
			if (speed <= 65) {
				fine = 0;
			} else if (speed <= 85) {
				fine = 100;
			} else {
				fine = 200;
			}
		} else {
			if (speed <= 60) {
				fine = 0;
			} else if (speed <= 80) {
				fine = 100;
			} else {
				fine = 200;
			}
		}

		return fine;

		/*solution*/
		// //휴일인 경우
		// if(isHoliday == true && speed > 65 && speed <= 85   ){
		// 	return 100;
		// }
		// if(isHoliday == true && speed >= 86 ){
		// 	return 200;
		// }
		// if(isHoliday == true && speed <= 65){
		// 	return 0;
		// }
		//
		// // 휴일이 아닌 경우
		// if(speed > 60 && speed <= 80   ){
		// 	return 100;
		// }
		// if(speed >= 81 ) {
		// 	return 200;
		// }else{
		// 	return 0;
		// }

		// int safeSpeed = 60;
		// int dangerSpeed = 80;
		// int tax = 0;
		//
		// if(isHoliday){
		// 	safeSpeed += 5;
		// 	dangerSpeed += 5;
		// }
		// if(speed > dangerSpeed){
		// 	tax = 200;
		// }
		// if(speed <= safeSpeed){
		// 	tax = 0;
		// }
		// if(speed > safeSpeed && speed <= dangerSpeed){
		// 	tax = 100;
		// }
		// return tax;
	}
}