package homework;

import java.util.Scanner;

public class Program4 {
    public static int sumDigits(int number){
        if (number >= 10) {
            int digit,sum=0;
            while (number>0){
                digit=number%10;
                sum=sum+digit;
                number=number/10;
            }return sum;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number =:");
        int result=sumDigits(scanner.nextInt());
        System.out.println("Sum of number digits is:"+result);
        scanner.close();

    }
}
