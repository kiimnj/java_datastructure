package stacknqueue;

import list.Node;

import java.util.EmptyStackException;

public class ListQueue<E> {
  private Node<E> front;
  private Node<E> rear;
  private int size;
  public ListQueue() {
    front = rear = null;
    size = 0;
  }
  public int size() { //O(N)
    return size;
  }
  public boolean isEmpty() { //O(N)
    return size == 0;
  }

  public E peak() { //O(N)
    return front.getItem();
  }

//  public E add(E item) { //addLast
//    Node<E> newNode = new Node<>(item);
//    if (size == 0) {
//      front = newNode;
//    }
////    Node temp = rear;
////    temp.setNext(newNode);
//    rear = newNode;
//    size++;
//    return newNode.getItem();
//  }
//
//  public E remove(E e) { //removeFirst
////    if (isEmpty()) throw new EmptyStackException();
////    if () {
////
////    }
//    E topItem = front.getItem();
//    front = front.getNext();
//    size--;
//    return topItem;
//  }
}
