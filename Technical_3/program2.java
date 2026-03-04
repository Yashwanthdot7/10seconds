import java.util.*;

class program2 {

    public static int func(int arr[], int n) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter n value: ");
        n = in.nextInt();
        System.out.println("Enter the values: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("First largest element in the entered array is: " + func(arr, n));

    }
}