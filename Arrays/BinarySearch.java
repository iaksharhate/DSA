package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        
        int[] numbers = {23, 24, 48, 54, 58, 65, 74, 88, 94};

        // Using binary search to find target element.
        int target = 88;

        System.out.println(binarySearch(numbers, target));
    }

    static int binarySearch (int[] numbers, int targert){
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (numbers[middle] == targert) {
                return middle;
            } else if (targert > numbers[middle]) {
                start = middle + 1;
            } else if (targert < numbers[middle]) {
                end = middle - 1;
            } else {
                return middle; 
            }
        }

        return -1;
    }
}
