import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.print("Enter the integers, one per line: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        Main(numbers);

        System.out.print("Sorted numbers: ");
        for (int num : numbers) {
            System.out.print(num);
            System.out.print(" ");
        }

        scanner.close();
    }

    private static void Main(int[] arr) {
        Arrays.sort(arr);
    }
}
