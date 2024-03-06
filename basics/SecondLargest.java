import java.util.Arrays;
public class SecondLargest {
    
    public static void main(String[] args) {
        int[] arr = {5, 80, 3, 65, 15};  // Example array, you can modify this with your own array values

        int temp;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print the sorted array (optional)
        System.out.println("Sorted array: " + Arrays.toString(arr));

        if (n >= 2) {
            System.out.println("Second Largest: " + arr[n - 2]);
        } else {
            System.out.println("Array should have at least two elements.");
        }
    }
}
