package homework;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public void alphabet() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a any alphabet: ");
        String ch = obj.nextLine();
        String ch1 = ch.toLowerCase(Locale.ROOT);
        char ch2 = ch.charAt(0);
        boolean flag = Character.isAlphabetic(ch2);
        if (ch1.length() == 1 && flag) {//Condition

            if (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u')
                System.out.println("Chareter is vowel");
            else
                System.out.println("chareter is consonant");

        } else {
            System.out.println("Invalid input");
        }
    }

    //Main method
    public static void main(String[] args) {
        Program3 obj = new Program3();
        obj.alphabet();
    }
}



