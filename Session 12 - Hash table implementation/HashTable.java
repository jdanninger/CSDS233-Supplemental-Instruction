import java.util.Arrays;
public class HashTable {
  
  private class Entry {
    public Integer key; //this is the unhashed data
    public boolean removed = true;

    public Entry(int key){
      this.key = key;
      removed = false;
    }
  }

  private Entry[] table;
  private int tableSize;

  public HashTable(int size){
    table = new Entry[size];
    tableSize = size; 
  }

  
  private int hash(int key){
    return(key%tableSize);
  }

//*^*^*^*^*^*^*^* Code Below *^*^*^*^*^*^*^*
  public void add(int key){

  }

  public void remove(int key){

  }


 //*^*^*^*^*^*^*^* Code Above *^*^*^*^*^*^*^* 













  
  public Integer[] printArray(){
    Integer[] returnMe = new Integer[tableSize];
    
    for(int n = 0; n < tableSize; n++){
      if(table[n] != null && !table[n].removed){
        returnMe[n] = table[n].key;
      }
    }
    System.out.println(Arrays.toString(returnMe));
    return(returnMe);
  }
  
}