public class App {

  public static void main(String[] args) throws Exception {
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.addFirst(10);
    linkedList.addFirst(15);
    linkedList.addFirst(20);
    linkedList.addFirst(25);
    linkedList.addFirst(30);

    linkedList.printList();
    System.out.println(linkedList.getSize());
    linkedList.findMiddle();
  }
}
