package method_overrdiing;

public class Bike extends Vehical {
    public void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String args[]) {
        Bike obj = new Bike();//creating object
        obj.run();//calling method
    }
}


