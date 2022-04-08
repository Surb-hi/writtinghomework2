package homework;

import java.util.Scanner;

public class Program11 {
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int lastDigit=0;
        int evenDigitSum=0;
        while(number!=0){
            lastDigit=number%10;
            if (lastDigit%2==0){
                evenDigitSum +=lastDigit;
            }
            number=number/10;
        }
        return evenDigitSum;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number:");
        int a=scanner.nextInt();
        int result=getEvenDigitSum(a);
        System.out.println("The sum of even digit is:"+result);
        scanner.close();
    }
}
