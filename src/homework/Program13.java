package homework;

public class Program13 {
    public static boolean hasShareDigit(int firstNumber,int secondnumber){
        if((firstNumber>=10 && firstNumber <=99) && (secondnumber>=10 && secondnumber<=99)){
            int firstnumberLastdigit=firstNumber%10;
            int secondnumberLastdigit=secondnumber%10;
            firstNumber/=10;
            secondnumber/=10;
            int firstnumberFirstdigit=firstNumber;
            int secondnumberFirstdigit=secondnumber;
            return ((firstnumberFirstdigit==secondnumberFirstdigit)||
                    (firstnumberFirstdigit==secondnumberLastdigit)||
                    (firstnumberLastdigit==secondnumberFirstdigit)||
                    (firstnumberLastdigit==secondnumberLastdigit));
        }return false;
    }

    public static void main(String[] args) {
        System.out.println(hasShareDigit(12,23));
        System.out.println(hasShareDigit(9,99));
        System.out.println(hasShareDigit(15,55));
    }
}
