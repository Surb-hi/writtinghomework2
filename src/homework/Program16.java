package homework;

public class Program16 {
    int x;
    int y;

    //Constructor with zero args
    Program16() {
    }

    //parameterised constructor
    Program16(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int a) {
        this.x = a;
    }

    public void setY(int b) {
        this.y = b;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - getX()) * (x - getX()) + (y - getY()) * (y - getY()));
    }

    public double distance(Program16 secondPoint) {
        return distance(secondPoint.x, secondPoint.y);
    }

    public static void main(String[] args) {
        Program16 first = new Program16(6, 5);
        Program16 second = new Program16(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Program16 point = new Program16();
        System.out.println("distance()= " + point.distance());
    }
}

