package oddEven;

import java.util.*;


public class OddEvenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an array size: ");
        int a = scanner.nextInt();

        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i : arr) {
            if (i % 2 == 0)
                System.out.println("even");
            else
                System.out.println("odd");
        }
    }
}
