import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
            printArray(arr);
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
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

        printArray(nums);

        selectionSort(nums);

        System.out.println("Sorted array:");
        printArray(nums);
    }
}
