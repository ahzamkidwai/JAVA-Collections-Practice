import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {
        /*
         * int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
         * int key = 4;
         * int index = Arrays.binarySearch(numbers, key);
         * 
         * System.out.println("The element " + key + " is present at index " + index);
         */

        Integer[] numbers = { 10, 2, 15, 32, 12, 76, 17, 48, 79, 9 };
        Arrays.sort(numbers);

        // Used in DP Questions to initialise the array with any number 
        // Arrays.fill(numbers,-1);

        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
