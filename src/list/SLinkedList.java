package list;

public class SLinkedList {
  private Node head;
  private int size;

  public int size() {
    return size;
  }
  public SLinkedList() {
    head = null;
    size = 0;
  }
  public void addFirst(Node newNode){
    if (head == null) {
      head = newNode;
      size++;
    } else {
      //
      size++;
    }
  }
}
