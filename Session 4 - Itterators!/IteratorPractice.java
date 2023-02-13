
// *^*^*^*^*^Imports Below *^*^*^*^*^
import java.util.LinkedList;
import java.util.ListIterator;

// *^*^*^*^*^Imports Above *^*^*^*^*^
class IteratorPractice {

    // *^*^*^*^*^Start coding Below *^*^*^*^*^

    public static int numOccur(LinkedList<String> list, String key) {
        int numOccur = 0;
        ListIterator<String> iter = list.listIterator();



        return (numOccur);
    }








    public static int length(LinkedList<String> list) {
        int len = 0;
        ListIterator<String> iter = list.listIterator();

        while(iter.hasNext()){
            iter.next();
            len++;
        }

        return (len);
    }










    public static String[] convertToArray(LinkedList<String> list) {
        String[] returnMe = new String[length(list)];
        ListIterator<String> iter = list.listIterator();
        return (returnMe);
    }

    /// CODE ABOVE THIS POINT

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("3");
        list.add("1");
        list.add("4");
        list.add("1");
        list.add("5");
        list.add("9");
        list.add("2");
        list.add("6");
        list.add("5");
        list.add("3");
        System.out.println("LinkedList:  " + list);
        System.out.println("");
        System.out.println("number of occurences of 5: " + numOccur(list, "5"));
        System.out.println("length of linked list " + length(list));
        System.out.println("");
        String[] arr = convertToArray(list).length == 0 ? new String[10] : convertToArray(list);
        System.out.println("the linked list coverted to array " + arr[0] + "," + arr[1] + "," + arr[2] + "," + arr[3]
                + "," + arr[4] + "," + arr[5] + "," + arr[6] + "," + arr[7] + "," + arr[8] + "," + arr[9] + ",");

    }
}