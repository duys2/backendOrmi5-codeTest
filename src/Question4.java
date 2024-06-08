/* 다음 문장을 for 문을 이용해 순회하면서 안에 있는 문자를 모두 순서대로 한번씩 콘솔로 출력해보세요.

String someTxt = "물방울이 떨어지는 소리를 들으며 나는 한적한 숲속 오두막에서 책을 읽고 있었다.";

== 출력 ==
물
방
울
이
... 이하 생략
==========

그리고 거꾸로 가장 마지막 문자부터 출력하도록 만들어 보세요.
*/

public class Question4 {
  public static void main(String[] args) {
    String text = "물방울이 떨어지는 소리를 들으며 나는 한적한 숲속 오두막에서 책을 읽고 있었다.";
    printText(text);

    // solution
    for (int i = 0; i < text.length(); i++) {
      System.out.println(text.charAt(i)); // i번째(index)의 문자를 출력
    }

    for (int i = text.length() - 1; i >= 0; i--) {
      System.out.println(text.charAt(i));
    }
  }

  static void printText(String s) {
    for (int i = 0; i < s.length(); i++) {
      System.out.println(s.charAt(i)); // i번째(index)의 문자
    }

    // 역순으로 출력
    for (int i = s.length() - 1; i >= 0; i--) {
      System.out.println(s.charAt(i));
    }
  }
}
