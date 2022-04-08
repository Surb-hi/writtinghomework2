package homework;

import java.util.Scanner;

public class Program8 {
    public static void symbolTriangle(int n){
        for(int i=0;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print("@");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Inpute number of rows");
        symbolTriangle(scanner.nextInt());
        scanner.close();
    }
}
