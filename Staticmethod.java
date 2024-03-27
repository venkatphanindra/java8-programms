import java.util.Arrays;
public class Staticmethod {
    public static void main(String[] args) {
        // Array of strings
        String[] names = {"Venkat", "Sai", "Srikanth", "Phanindra"};

        // Using a method reference to refer to the static method Arrays.sort
        Arrays.sort(names, Staticmethod::compareStrings);

        // Printing the sorted array
        System.out.println("Sorted names:");
        Arrays.stream(names).forEach(System.out::println);
    }

    // Static method to compare two strings
    public static int compareStrings(String s1, String s2) { 
             return s1.compareTo(s2);
    }
}
