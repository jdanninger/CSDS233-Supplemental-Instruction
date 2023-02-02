import java.util.Arrays;

public class DoublyLinkedList{
    Node head;
    Node tail; 

    private class Node {

        int data;
        Node next;
        Node previous;
        Node(int d) {
          data = d;
          next = null;
          previous = null;
        }
      }
      // WRTIE YOUR CODE BELOW *^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^

      public void insert(int value, int index){

      }

      public int[] intoArray(){
        return null;
      }








      // WRTIE YOUR CODE Above *^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^

      public void add(int insertMe) { //this method inserts a given int to end of LL
        if (head == null) {
          head = new Node(insertMe);
          tail = head;
        } else {

          tail.next = new Node(insertMe); //set tail to point to newly inserted node
          tail.next.previous = tail;  //sets new node to point backwards to tail
          tail = tail.next;
        }
      }
      public void printList() { //this prints the LL out in console
        String printMe = "";
        Node currentNode = head;
        while (currentNode != null) {
          printMe = printMe + currentNode.data + ", ";
          currentNode = currentNode.next;
        }
        System.out.println(printMe);
      }
      public int get(int index){
        Node itt = head;
        for(int n = 0; n<index; n++){
          itt = itt.next;
        }
        return(itt.data);
      }

      public static void main(String[] args){
        DoublyLinkedListAns list = new DoublyLinkedListAns();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        int[] arr = new int[]{ 1,2,3,4,5,6,7 }; 

        if(Arrays.equals(arr, list.intoArray())){
          System.out.println("intoArray Works!");
        }else{
          System.out.println("intoArray doesnt work");
        }

        list.insert(-1,1);
        list.insert(-2, 3);
        if(list.get(1)==-1 && list.get(3)==-2){
          System.out.println("Insert Works!");
        }else{
          System.out.println("Insert doesnt work");
        }

      }
      

}