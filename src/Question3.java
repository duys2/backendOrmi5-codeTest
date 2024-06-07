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
    /*int jump = 0;
    String text;

    while (true) {
      text = str.substring(str.indexOf(":") + 2 + jump, str.indexOf(",", str.indexOf(":")) + jump);
      jump += text.length();
      System.out.println(text);
    }*/

    // solution
    int i = 0;

    while (true) {
      // i의 값이 업데이트 되면서 해당 인덱스의 문자열 탐색
      int idx = str.indexOf("category:", i);

      // 더 이상 찾을 수 없으면 indexOf()는 -1을 반환. 즉, 더이상 찾을 수 없으면 while문 종료
      if (idx == -1) break;

      int startIdx = idx + 9;
      int endIdx = str.indexOf(',', startIdx);

      System.out.println(str.substring(startIdx, endIdx));

      i = endIdx + 1;
    }

    /*static void printCategory(String str){
      int i =0;
      while(true){
        // i 의 값이 업데이트 되면서 해당 인덱스의 문자열을 탐색합니다.
        int idx = str.indexOf("category:", i);
        if(idx == -1){
          break;
        }

        int startIdx = idx + 9;
        int endIdx = str.indexOf(',', startIdx);

        System.out.println(str.substring(startIdx, endIdx));

        i = endIdx+1;
      }
    }*/
  }
}
