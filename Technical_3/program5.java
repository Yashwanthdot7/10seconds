import java.util.*;

public class program5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of inputs: ");
        int n = in.nextInt();

        List<Integer> inputList = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new TreeSet<>();

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            inputList.add(val);

            if (!seen.add(val)) {
                duplicates.add(val);
            }
        }

        if (!duplicates.isEmpty()) {
            System.out.println("Array contains duplicate elements: " + duplicates);
        } else {
            System.out.println("No duplicates found.");
        }
    }
}