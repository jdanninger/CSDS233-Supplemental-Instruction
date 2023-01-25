public class RecursivePractice {

    // Write your code below this point *^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^

    public void countDown(int n) {
        // this method should recurisvely print into console a count down from n to 1

    }

    public int sumOfNumbers(int n) {
        // this should recursively return the sum of n to 0, eg sumOfNumbers(4) = 10 =
        // 1+2+3+4
        return 0;
    }

    public boolean isAscending(int[] arr, int index) {
        // this should recursivley check if an array is ascending
        // the starting index given by the test case is 1
        // the index var should be used to check if that index is more than the previous
        // index
        return false;
    }

    // Write your code above this point *^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^

    public static void main(String[] args) {
        RecursivePractice N = new RecursivePractice();

        System.out.println("The next few lines of console output should be 5, 4, 3, 2, 1");
        N.countDown(5);

        // I am using the Main method for test cases, you dont need to touch this
        if (N.sumOfNumbers(5) == 15 && N.sumOfNumbers(100) == 5050) {
            System.out.println("\n sumOfNumbers passes all test cases \n");
        } else {
            System.out.println("\n sumOfNumbers doesnt work :( \n");
        }

        int[] arr1 = { 1, 2, 4, 6, 8, 9 };
        int[] arr2 = { 1, 2, 4, 60, 8, 9 };
        if (N.isAscending(arr1, 1) && !N.isAscending(arr2, 1)) {
            System.out.println("\n isAscending passes all test cases \n");
        } else {
            System.out.println("\n isAscending doesnt work :( \n");
        }

    }
}