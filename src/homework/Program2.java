package homework;

import java.util.Scanner;

public class Program2 {

    public static void findminAndMaxNumbers() {

        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
            }

            System.out.println("min=" + min + ", max" + max);
            scanner.close();
        }

    public static void main(String[] args) {
        findminAndMaxNumbers();
    }
}
