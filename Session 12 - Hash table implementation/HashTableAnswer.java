import java.util.Arrays;
public class HashTableAnswer {
  
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

  public HashTableAnswer(int size){
    table = new Entry[size];
    tableSize = size; 
  }

  
  private int hash(int key){
    return(key%tableSize);
  }

//*^*^*^*^*^*^*^* Code Below *^*^*^*^*^*^*^*
  public void add(int key){
    int index = hash(key);
    int itter = 1;
    while(table[index] != null && table[index].removed == false){
      index = (index+1)%tableSize;
      if(itter == tableSize){
        System.out.println("table is full");
        return;
      }
      itter++;
    }
      table[index] = new Entry(key);
  }

  public void remove(int key){
    int index = hash(key);
    int itter = 1;
    while(table[index]==null || table[index].removed == true || table[index].key != key){
      index = (index+1)%tableSize;
      if(itter == tableSize){
        System.out.println("unable to remove. . . not in table");
        return;
      }
      itter++;
      
    }
    table[index].removed = true;
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