/*
여러분은 아주 크게 짖는 개를 키우고 있습니다.
	hour 매개변수는 현재 시각을 의미하고 0~23까지 숫자를 넣을 수 있습니다.
	만약 개가 7시 이전이나 20시 이후에 짖으면 매우 곤란해질겁니다.
	만약 곤란한 상황이 발생하면 "짖으면 안돼!!" 를 반환하세요, 아니라면 "든든하군!" 을 반환하세요.

	barkingDogProblem(true, 6) ==> "짖으면 안돼!!"
	barkingDogProblem(true, 7) ==> "든든하군!"
	barkingDogProblem(false, 5) ==> "든든하군!"
*/

public class Question2 {
  public static void main(String[] args) {
    barkingDogProblem(true, 6);
    barkingDogProblem(true, 7);
    barkingDogProblem(false, 5);
  }

  static void barkingDogProblem(boolean barking, int hour) {
    if (barking && (hour < 7 || hour >= 20)) {
      System.out.println("짖으면 안돼!");
    } else {
      System.out.println("든든하군!");
    }

    // solution
    // return barking && (hour < 7 || hour > 20) ? "짖으면 안돼!!" : "든든하군!";
  }
}
