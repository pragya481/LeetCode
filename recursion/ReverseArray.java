import java.util.Scanner;

public class ReverseArray {

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i]+arr[j];
        arr[j] = arr[i]-arr[j];
        arr[i] = arr[i]-arr[j];
    }

    public static void reverse(int[] arr, int ind) {
        int n = arr.length;
        if (ind >= n/2) {
            return;
        }
        swap(arr, ind, n-ind-1);
        reverse(arr, ind+1);
    }

    public static void main(String ...args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.err.println("Enter elements of array:");
        int arr [] = new int[n];
        for(int i = 0 ;i<n;i++) {
            arr[i] = scanner.nextInt();
        }

        reverse(arr, 0);

        for(int i = 0 ;i<n;i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}