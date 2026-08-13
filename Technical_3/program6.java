import java.util.Scanner;
import java.util.Arrays;

public class program6 {
    public static int Product(int[] arr, int sum) {
        if (arr.length < 2) {
            return -1;
        }
        Arrays.sort(arr);
        int s = arr[0] + arr[1];
        if (s < sum)
            return arr[0] * arr[1];
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of inputs: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter sum: ");
        int sum = in.nextInt();

        System.out.println(Product(arr, sum));
    }
}
