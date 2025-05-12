package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        System.out.println("Before reverse : " + Arrays.toString(numbers));
        // Using two pointer method.
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            
            start++;
            end--;
        }
        
        System.out.println("After sorting reverse : " + Arrays.toString(numbers));
    }
}