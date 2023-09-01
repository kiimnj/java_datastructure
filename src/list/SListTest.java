package list;

import java.util.LinkedList;

public class SListTest {
  public static void main(String[] args) {
    SLinkedList sl = new SLinkedList();

    Node<Integer> node = new Node<>(50);
//    sl.addFirst(node);
    sl.add(0, node); // == addFirst()
    System.out.println(sl.size());

    Node<Integer> node1 = new Node<>(40);
    sl.addLast(node1);

    Node<Integer> node3 = new Node<>(30);
    sl.add(1, node3);

    Node<Integer> node2 = new Node<>(10);
    sl.add(3, node2); // // == addLast()?
    System.out.println(sl.size());

    System.out.println(sl);
    System.out.println("50의 index는 " + sl.indexOf(50));
    System.out.println("60의 index는 " + sl.indexOf(60));

    System.out.println(sl.removeFirst() + "이 삭제됨");
    System.out.println("삭제 후 : " + sl);
    System.out.println(sl.removeFirst() + "이 삭제됨");
    System.out.println("삭제 후 : " + sl);
    System.out.println(sl.removeFirst() + "이 삭제됨");
    System.out.println("삭제 후 : " + sl);
    System.out.println(sl.removeFirst() + "이 삭제됨");
    System.out.println("삭제 후 : " + sl);



    LinkedList<Integer> ll = new LinkedList<>();
    ll.add(10); //O(1)로 처리하기 위해 디폴트로 addLast 사용됨
    ll.add(20);
    System.out.println(ll);

    LinkedList<Integer> ll2 = new LinkedList<>();
    ll2.addLast(10);
    ll2.addLast(20);
    System.out.println(ll2);
  }
}
