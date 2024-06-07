public class Main {
  public static void main(String[] args) {
    MyClass.staticNum++;
    System.out.println(MyClass.staticNum);
    MyClass.staticMethod();
  }

  public class MyClass {
    public static int staticNum = 0;

    public static void staticMethod() {
      System.out.println("This is a static method");
    }
  }

  // static ==> 클래스 레벨의 필드와 메소드를 정의할 때 사용하는 키워드
  // 클래스 레벨 ==> 인스턴스(클래스로부터 생성된 객체, new 키워드)에 속하는 게 X
}