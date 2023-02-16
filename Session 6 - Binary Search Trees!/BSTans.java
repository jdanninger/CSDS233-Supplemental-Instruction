class BSTans {
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
    BSTans(){
    }
    BSTans(int rootVal){
      root = new Node(5);
    }
  /* start CODE HERE *^*^*^*^*^**^*^*^****^*^*^ */
    
    public void add(int val){
      if(root == null){
        root = new Node(val);
        return;
      }
      this.add(root, val);
    }
  
    private void add(Node current, int val){
      if(val > current.value){
        if(current.right != null){
          this.add(current.right, val);
        } else if(current.right == null){
           current.right = new Node(val);
           return;
        }
       }else if(val < current.value){
         if(current.left != null){
          this.add(current.left, val);
        } else if(current.left == null){
           current.left = new Node(val);
           return;
        }
       }
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
      BSTans binarySearchTree = new BSTans(5);
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