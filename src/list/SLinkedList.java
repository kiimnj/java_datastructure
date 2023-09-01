package list;

public class SLinkedList {
  private Node head;
  private Node tail;
  private int size;

  public int size() {
    return size;
  }
  public SLinkedList() {
    head = null;
    tail = null; //꼭 필요한건 아님(여기선 추가기능 구현용) - dl에선 필수: 자바api에서 사용, 검색 빠르고 메모리 많이 먹음
    size = 0;
  }
  public void addFirst(Node newNode){ //head == null && tail == null
    if (size == 0) {
      tail = newNode;
    }
    newNode.setNext(head);
    head = newNode;
    size++;
  }

  public void addLast(Node newNode){
//    Node tail = getTail();
    if (size == 0) {
//      head = newNode;
      addFirst(newNode);
    } else {
      tail.setNext(newNode);
      tail = newNode;
      size++;
    }
  }

  //add, remove의 bigO(최악의 시간)은 N (O(N))
  public void add(int index, Node newNode) { //교재는 Node newNode 가 아닌 Object - 원조와 동일
    if (index == 0) {
      addFirst(newNode);
    } else {
      Node prevNode = getNode(index - 1);
      newNode.setNext(prevNode.getNext());
      prevNode.setNext(newNode);
      size++;
    }
    if (newNode.getNext() == null) {
      tail = newNode;
    }
  }

  public Node getNode(int index) { //중간에 값 넣기 위해 필요
    Node x = head;
    for (int i = 0; i < index; i++) {
      x = x.getNext();
    }
    return x;
  }

  public Node getTail() {
    Node temp = head.getNext();
    while (temp.getNext() != null) {
      temp = temp.getNext();
    }
    return null;
  }
  public <E> int indexOf(E e) { //수업은 boolean 이용
    Node temp = head;
    int index = 0;
    while (temp.getItem() != e) { //O(N)소요
      temp = temp.getNext();
      index++;
      if (temp == null) {
        return -1;
      }
    }
    return index;
  }
  public String removeFirst() {
    Node temp = head;
    head = temp.getNext();
    temp.setNext(null); //null로 해줘야 next가 사라져서 orphan이 됨
    size--;
    return temp.getItem().toString();
  }
  @Override
  public String toString() {
    String str =  "[";
    Node x = head;
    if (size == 0) {
      return "[]";
    }
    for (int i = 0; i < size - 1; i++) {
      str += (x.getItem() + ", ");
      x = x.getNext();
    }
    return str += (x.getItem() + "]");
  }
}
