package list;

import java.util.ArrayList;

public class ArrListTest {
  public static void main(String[] args) {
    //내가 만든 ArrList
    ArrList<Integer> list = new ArrList<>();
    System.out.println(list.size());
    list.add(10);
    System.out.println(list.get(0));
    list.add(20);
    System.out.println(list.get(1));
    list.add(30);
    list.add(40);

//    System.out.println(list.remove() + "가 삭제됨");
//    System.out.println(list.remove() + "가 삭제됨");
//    System.out.println(list.remove() + "가 삭제됨");
//    System.out.println(list.remove() + "가 삭제됨");
//    list.remove(); //익셉션 발생

    System.out.println("size : "+ list.size());
    list.add(2, 50);
    System.out.println("size : "+ list.size());

//    System.out.println(list.get(1) + list.get(2) + list.get(3));
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
    System.out.println();
    System.out.println("list : " + list);


    //원래 ArrayList
    ArrayList<Integer> aList = new ArrayList<>();
    System.out.println(aList.size());
    aList.add(10);
    aList.add(20);
    aList.add(30);
    aList.add(40);
//    aList.add(5, 50); //IndexOutOfBoundsException
    System.out.println(aList.get(0));
  }
}
