import java.util.Arrays;
class Tests {
  public static void main(String[] args) {
    
    HashTable HS = new HashTable(7);
    HS.add(4);
    HS.add(5);
    HS.add(6);
    HS.add(11);
    HS.add(12);
    HS.add(8);
    
    Integer[] solution1 = {11,12,8,null,4,5,6};
    Integer[] test1 = HS.printArray();

    if(Arrays.equals(test1, solution1)){
      System.out.println("Add method works");
    }else{
      System.out.println("Add method doesnt work");
    }

    HS.remove(12);
    HS.remove(6);
    HS.remove(11);

    Integer[] solution2 = {null,null,8,null,4,5,null};
    Integer[] test2 = HS.printArray();

    if(Arrays.equals(test2, solution2)){
      System.out.println("Remove method works");
    }else{
      System.out.println("Remove method doesnt work");
    }
    
  }
}