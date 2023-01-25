public class RecursivePracticeAnswers {

    // Write your code below this point *^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^

    public void countDown(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        countDown(n - 1);
    }

    public int sumOfNumbers(int n) {
        if (n == 0) {
            return (0);
        }
        return (sumOfNumbers(n - 1) + n);
    }

    public boolean isAscending(int[] arr, int index) {
        if (index == arr.length) {
            return true;
        }

        if (arr[index] > arr[index - 1]) {
            return (isAscending(arr, index + 1));
        } else {
            return false;
        }
    }

    // Write your code above this point *^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^

    public static void main(String[] args) {
        RecursivePracticeAnswers N = new RecursivePracticeAnswers();

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