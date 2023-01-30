public class LinkedListAnswer {

  Node head;

  private class Node {

    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  public void insert(int insertMe) {
    if (head == null) {
      head = new Node(insertMe);
    } else {
      Node currentNode = head;
      while (currentNode.next != null) {
        currentNode = currentNode.next;
      }
      currentNode.next = new Node(insertMe);
    }
  }

  public void printList() {
    String printMe = "";
    Node currentNode = head;
    while (currentNode != null) {
      printMe = printMe + currentNode.data + ", ";
      currentNode = currentNode.next;
    }
    System.out.println(printMe);
  }

  // *^*^*^*^*^*^*^*^ Create a get method returns the index of a searched for int
  // or -1 if the int is not in the linked list (assume the linked list isnt
  // empty)*^*^*^*^*^*^*^*^
  public int search(int query) {
    Node currentNode = head;
    int count = 0;
    while (currentNode != null) {
      if (currentNode.data == query) {
        return (count);
      }
      count++;
      currentNode = currentNode.next;
    }
    return (-1);
  }

  // *^*^*^*^*^*^*^*^ Create a get method that returns the value at a given index
  // (assume the index is always valid) *^*^*^*^*^*^*^*^
  public int get(int index) {
    Node currentNode = head;
    for (int n = 0; n < index; n++) {
      currentNode = currentNode.next;
    }
    return (currentNode.data);
  }

  // *^*^*^*^*^*^*^*^ Create a get method that delets the node at a given index
  // (assume the index is always valid)*^*^*^*^*^*^*^*^
  public void delete(int index) {
    if (index == 0) {
      head = head.next;
      return;
    }
    Node currentNode = head;
    Node previousNode = null;
    for (int n = 0; n < index; n++) {
      previousNode = currentNode;
      currentNode = currentNode.next;
    }
    previousNode.next = currentNode.next;
  }

  public static void main(String[] args) {
    // System.out.println("Hello world!");
    LinkedListAnswer list = new LinkedListAnswer();

    list.insert(1);
    list.insert(2);
    list.insert(3);
    list.insert(4);
    list.insert(5);
    list.insert(6);
    list.insert(7);
    list.insert(8);
    list.insert(9);
    list.insert(10);
    list.printList();

    System.out.println();
    System.out.println(list.get(0) + " should be 1");
    System.out.println(list.get(9) + " should be 10");
    System.out.println(list.get(4) + " should be 5");
    System.out.println();
    list.delete(9);
    list.delete(0);
    list.delete(1);
    list.printList();
    System.out.println("the list above should be 2, 4, 5, 6, 7, 8, 9,");
    System.out.println();

    System.out.println(list.search(6) + " should be 3");
    System.out.println(list.search(9) + " should be 6");
    System.out.println(list.search(10) + " should be -1");

  }

}
