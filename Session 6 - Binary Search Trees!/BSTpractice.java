class BSTpractice {
    static class Node {
      int value;
      Node left;
      Node right;
  
      Node(int value) {
          this.value = value;
          right = null;
          left = null;
      }
    }
    
    private Node root = null;
    BSTpractice(){
    }
    BSTpractice(int rootVal){
      root = new Node(5);
    }
  /* start CODE HERE *^*^*^*^*^**^*^*^****^*^*^ */
    
    public void add(int val){
        //add your code here: I made two add methods one for public acsess and another for recursive calls. . . do whatever works for you!
    }
  
    private void add(Node current, int val){

    }
  /* CODE you added ends here *^*^*^*^*^**^*^*^****^*^*^ */
  
    public void inOrderPrint(Node current){
      if(current == null){
        current = root;
      }
      if(current.left != null){
        this.inOrderPrint(current.left);
      }
      System.out.print(current.value+ ", ");
      if(current.right != null){
        this.inOrderPrint(current.right);
      }
    }




    public static void main(String[] args) {
      BSTpractice binarySearchTree = new BSTpractice(5);
      binarySearchTree.add(7);
      binarySearchTree.add(3);
      binarySearchTree.add(1);
      binarySearchTree.add(4);
      binarySearchTree.add(2);
      binarySearchTree.add(9);
      binarySearchTree.add(8);
      binarySearchTree.add(10);
      binarySearchTree.add(6);
      binarySearchTree.inOrderPrint(null);
      System.out.println("");
      System.out.println("the console should be filled with 1-10 in ascending order");
    }
      
    
  }