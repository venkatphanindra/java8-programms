import java.util.Arrays;

public class Parallelarraysorting {
    public static void main(String[] args) {
        // Example array to be sorted
        int[] numbers = {5, 3, 9, 1, 7, 4, 8, 2, 6};

        // Parallel sorting of the array
        Arrays.parallelSort(numbers);

        // Display the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}