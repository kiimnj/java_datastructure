package hashtable;

public class ChainingDemo {
  public static void main(String[] args) {
    Chaining<Integer, String> c = new Chaining<>();
    c.put(10, "A");
    c.put(23, "B");
    c.put(36, "C");

    System.out.println(c.get(36));

    System.out.println(c);
//    Chaining<Integer, String> c2 = new Chaining<>();
//    c2.put(50, "orange");
//    c2.put(63, "banana");
//    c2.put(37, "watermelon");
//    c2.put(22, "mango");
//    System.out.println(50 + "의 data = " + c2.get(50));

  }
}
