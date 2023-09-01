package hashtable;

import list.Node;

public class Chaining<K, V> {
  private int M = 13;
  private Node[] a = new Node[M];

  //정적 중첩 클래스
  public static class Node {
    private Object key;
    private Object data;
    private Node next; //링크드리스트
    public Node(Object key, Object data, Node next) {
      this.key = key;
      this.data = data;
      this.next = next;
    }

    public Object getKey() {
      return key;
    }

    public Object getData() {
      return data;
    }
  }
  private int hash(K key) {
    return (key.hashCode() & 0x7fffffff) % M; //signed라서 없애기 위해
  }
  public V get(K key) {
    int index = hash(key);
    for (Node x = a[index]; x != null; x = x.next) {
      if(key.equals(x.key)) return (V) x.data;
    }
    return null;
  }

  public void put(K key, V data) {
    int index = hash(key);
    for (Node x = a[index]; x != null; x = x.next) {
      if (key.equals(x.key)) {
        x.data = data;
        return;
      }
    }
    a[index] = new Node(key, data, a[index]); //a[index] -> O(N)
  }

  @Override
  public String toString() {
    String str = "";
    for (int i = 0; i < a.length; i++) {
      str += i;
      for (Node x = a[i]; x != null; x = x.next) {
//        str += "--> [ " + a[i].getKey() + ", " + a[i].getData() + " ]";
        str += "--> [ " + a[i].key + ", " + a[i].data + " ]";
      }
      str += "\n";
    }
    return str;
  }
}
