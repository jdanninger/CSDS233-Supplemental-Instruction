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
        // I am using the Main method for test cases. . . you do not need to mess with
        // this :)

    }
}