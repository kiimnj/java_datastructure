package stacknqueue;

import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    //스택은 구현클래스
    Stack<Integer> s = new Stack<>();
    System.out.println("--스택--");
//    s.peek(); //EmptyStackException
    s.push(10);
    s.push(20);
    s.push(30);

    while (!s.empty()) {
      System.out.println(s.pop() + "이 삭제됨");
    }

    ListStack<String> ls = new ListStack<>();
    System.out.println("--리스트 스택--");
    System.out.println("push : " + ls.push("A"));
    ls.push("B");
    ls.push("C");
    System.out.println("peek : " + ls.peek());
    while (!ls.isEmpty()) {
      System.out.println(ls.pop() + "이 삭제됨");
    }
  }
}
