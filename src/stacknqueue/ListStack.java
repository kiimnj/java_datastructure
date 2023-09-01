package stacknqueue;

import list.Node;

import java.util.EmptyStackException;

public class ListStack<E> {
  private Node<E> top;
  private int size;
  public ListStack() {
    top = null;
    size = 0;
  }
  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public E peek() { //수업: <E>(제너릭 메서드) => 에러
    if (isEmpty()) throw new EmptyStackException();
    return top.getItem();
  }

  public E push(E item) {
    Node<E> newNode = new Node<>(item);
    newNode.setNext(top);
    top = newNode;
    size++;
    return newNode.getItem();
  }

  public E pop() {
    if (isEmpty()) throw new EmptyStackException();
    E topItem = top.getItem();
    top = top.getNext();
    size--; //원래 top을 null로 만들기까지 하면 더 좋음
    return topItem;
  }
}
