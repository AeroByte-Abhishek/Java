package College;

public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Print array elements using a for loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Calculate and display the sum of array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number; // Add each element to sum
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
