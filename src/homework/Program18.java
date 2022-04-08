package homework;

public class Program18 {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Program18(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    Program18(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Program18 s1 = new Program18(111, "Karan");
        Program18 s2 = new Program18(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}


