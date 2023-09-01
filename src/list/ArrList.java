package list;

public class ArrList<E> {
  //인스턴스 변수
  private E a[]; //[]빼도 됨, == private E[] a;
  private int size;

  //생성자
  public ArrList(){
    a = (E[]) new Object[1]; //크기 1인 최초의 배열
    size = 0;
  }
  ///연산 메서드
  public int size() { //getSize가 맞지만 ArrayList따라서 이름 지음
    return size;
  }
  public E get(int k) {
    if (size == 0 || k >= size) //처리 안해도 Array에서 에러 발생
      throw new IndexOutOfBoundsException();
    return a[k];
  }

  public boolean add(E e) { //
    if (a.length == size) {
//      throw new ArrayIndexOutOfBoundsException();
      resize(a.length * 2);
    }
    a[size++] = e;
    return true;
  }
  public boolean add(int index, E e) {
//    if (index <= a.length) {
      if (a.length == size) {
//      throw new ArrayIndexOutOfBoundsException();
        resize(a.length * 2);
      }
      for (int i = size - 1; i >= index; i--) {
        a[i + 1] = a[i];
      }
      a[index] = e;
      size++;
//    } else {
//      if (index >= size) {
//        resize(index);
//        a[index] = e;
//        size = index;
//      }
//    }
    return true;
  }

  public E remove() { //removeLast
    if (size == 0)
      throw new IndexOutOfBoundsException();
    E toBeDeleted = a[size - 1];
    a[size - 1] = null;
    size--;

    if (size > 0 && a.length == size / 4) {
//      throw new ArrayIndexOutOfBoundsException();
      resize(a.length / 2);
    }
    return toBeDeleted;
  }

  public E remove(int index){ // removeLast
    if(size == 0)
      throw new IndexOutOfBoundsException();
    E tobeDeleted = a[index];
    a[index] = null;
    for(int i = index + 1; i < size ; i++){
      a[i-1] = a[i];
    }
    size--;
    if(size > 0 && size == a.length/4){
      resize(a.length / 2);
    }
    return tobeDeleted;
  }

  public <E> int indexof(E e) { //<E>, index=-1; ->  if-break;로도 가능
    for (int i = 0; i < a.length; i++) {
      if (a[i] == e) {
        return i;
      }
    }
    return -1;
  }

  private void resize(int newSize) {
//    System.out.println("resize가 호출됨(" +  +")");
    E[] t = (E[])new Object[newSize];
    for (int i = 0; i < size; i++) {
      t[i] = a[i];
    }
    a = t;
  }

  @Override
  public String toString() {
    String list =  "[";
    for (E arr : a) {
      list += (arr + " ");
    }
    return list += "]";
  }
}
