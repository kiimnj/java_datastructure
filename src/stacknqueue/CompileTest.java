package stacknqueue;

public class CompileTest {
  public static void main(String[] args) {
    ListStack<String> stack = new ListStack<>();
    String[] par = {"{","(",")","{","(",")",")","}","("}; //"}" 추가하면 익셉션...
    for (String p : par) {
      if (p.equals("{") || p.equals("(")) {
        stack.push(p);
      } else {
        if (p.equals("}") && stack.pop().equals("{")) {
          System.out.println("} 괄호 정상적으로 닫힘");
        }
        else if (p.equals(")") && stack.pop().equals("(")) {
          System.out.println(") 괄호 정상적으로 닫힘");
        }
        else System.out.println("컴파일 오류");
      }
    }
    if (!stack.isEmpty()) System.out.println("컴파일 오류");
  }
}
