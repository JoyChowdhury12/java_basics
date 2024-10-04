package company;

class Base {
    int x;

    public void setX(int x) {
        System.out.println("Iam in base and setting x now ");
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void printMe() {
        System.out.println("Iam a constructor");
    }
}

class Derived extends Base {
    int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

public class cwh45_inheritence {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(3);
        System.out.println(b.getX());
        System.out.println();

        Derived d = new Derived();
        d.setX(5);
        System.out.println(d.getX());
        d.setY(44);
        System.out.println(d.getY());
    }
}
