import java.util.Scanner;
import java.util.Arrays;

public class program7 {
    public static int Sum(int[] arr) {
        Arrays.sort(arr);
        int evenPositions[] = new int[arr.length / 2];
        int[] oddPositions;

        if(arr.length % 2 == 0) {
            oddPositions = new int[arr.length / 2];
        } else {
            oddPositions = new int[arr.length/2 + 1];
        }
        int evenCounter = 0, oddCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenPositions[evenCounter++] = arr[i];
            } else {
                oddPositions[oddCounter++] = arr[i];
            }
        }
        int evenSecondLar = evenPositions[evenPositions.length - 2];
        int oddSecondLar = oddPositions[oddPositions.length - 2];

        return evenSecondLar + oddSecondLar;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of inputs: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Sum(arr));
    }
}
