public class LinkedList<T> {

  private class Node<T> {

    private T value;
    private Node<T> next;

    public Node(T value) {
      this.value = value;
      this.next = null;
    }

    public Node() {
      this.value = null;
      this.next = null;
    }
  }

  private Node<T> head;
  private int size;

  public LinkedList() {
    this.head = null;
    this.size = 0;
  }

  public boolean isEmpty() {
    return this.head == null;
  }

  public int getSize() {
    return size;
  }

  public void printList() {
    if (!isEmpty()) {
      Node<T> newNode = head;
      while (newNode != null) {
        System.out.println(newNode.value);
        newNode = newNode.next;
      }
      return;
    }
    System.out.println("List is Empty");
  }

  public void addFirst(T value) {
    size++;
    if (isEmpty()) {
      head = new Node<T>(value);
      return;
    }
    Node<T> current = new Node<>(value);
    current.next = head;
    head = current;
  }

  public void addLast(T value) {
    size++;
    if (isEmpty()) {
      head = new Node<T>(value);
      return;
    }
    Node<T> current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = new Node<>(value);
  }

  public void removeFirst() {
    if (isEmpty()) {
      return;
    }
    head = head.next;
    size--;
  }

  public void removeLast() {
    if (isEmpty()) {
      return;
    }
    if (size == 1) {
      head = null;
      size--;
      return;
    }
    Node<T> current = head;
    while (current.next.next != null) {
      current = current.next;
    }
    current.next = current.next.next;
    size--;
  }

  public void removeWithValue(T value) {
    if (isEmpty()) {
      return;
    }
    Node<T> current = head;
    if (current.value == value) {
      head = head.next;
      size--;
      return;
    }
    while (current.next != null) {
      if (current.next.value == value) {
        current.next = current.next.next;
        size--;
        return;
      }
      current = current.next;
    }
  }

  public void findMiddle() {
    if (isEmpty()) {
      System.out.println("List is Empty");
      return;
    }
    if (head.next == null) {
      System.out.println(head.value);
      return;
    }
    Node<T> current1 = head;
    Node<T> current2 = head;
    while (current2.next != null) {
      current2 = current2.next;
      current2 = current2.next;
      current1 = current1.next;
    }
    System.out.println(current1.value);
    return;
  }
}
