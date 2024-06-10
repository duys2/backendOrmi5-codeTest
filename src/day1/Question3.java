package day1;

/*
주어진 문장에서 category 에 해당하는 모든 단어를 출력하세요.
     "When organizing items, always label each group with the appropriate
     category. category: books, category: electronics, category: clothing, category: kitchenware,
     and so on. "
*/

public class Question3 {
  public static void main(String[] args) {
    String str =
        "When organizing items, always label each group with the appropriate category. category: books, category: electronics, category: clothing, category: kitchenware, and so on.";
    printCategory(str);
  }

  static void printCategory(String str) {
    // solution
    int i = 0;

    while (true) {
      // i의 값이 업데이트 되면서 해당 인덱스의 문자열 탐색
      int index = str.indexOf("category:", i);

      // 더 이상 찾을 수 없을 때 -1 반환
      if (index == -1) break; // 더 이상 찾을 수 없으면 while 문 종료

      int startIndex = index + 9;
      int endIndex = str.indexOf(',', startIndex); // 시작한 인덱스만큼 건너뛰기

      System.out.println(str.substring(startIndex, endIndex)); // 문자열 추출

      i = endIndex + 1;
    }
  }

  /*
  static void printCategory(String str){
    int i =0;
    while(true){
      // i 의 값이 업데이트 되면서 해당 인덱스의 문자열을 탐색합니다.
      int index = str.indexOf("category:", i);
      if(index == -1){
        break;
      }

      int startIndex = index + 9;
      int endIndex = str.indexOf(',', startIndex);

      System.out.println(str.substring(startIndex, endIndex));

      i = endIndex+1;
    }
  }
  */
}
