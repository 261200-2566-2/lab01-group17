import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void sortedArray(int[] arr) {
        Arrays.sort(arr);
    }

    public static void printTextInLine(int num, int[] arr) {
        System.out.println("< Sorted >");
        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number of inputs: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] numbers = new int[number];

        System.out.println("< Input >");
        for (int i = 0; i < number; i++) {
            numbers[i] = input.nextInt();
        }

        sortedArray(numbers);
        printTextInLine(number, numbers);
    }
}