package Arrays;


import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " element of array : ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static void displayArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
