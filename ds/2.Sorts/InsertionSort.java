import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
           printArray(arr);
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[], n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n value");
        n = in.nextInt();
        nums = new int[n];
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("The Before Sort the Elements are");
        System.out.println("Original array:");
        printArray(nums);

        insertionSort(nums);

        System.out.println("Sorted array:");
        printArray(nums);
    }
}
