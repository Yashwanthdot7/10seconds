import java.util.*;

class program3 {

    public static int func(int arr[], int n) {
        if (arr.length < 2) return -1;
        int max = arr[0];
        int max_2 = 0;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max_2 = max;
                max = arr[i];
            }
            else {
                if (arr[i] > max_2 && arr[i] < max) {
                    max_2 = arr[i];
                }
            }
        }
        return max_2;
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
        System.out.println("Second largest element in the entered array is: " + func(arr, n));

    }
}