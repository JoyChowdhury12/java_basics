package company;

class Cylinder {
    private int height;
    private int radious;

    public int getHeight() {
        return height;
    }

    public Cylinder(int height, int radious) {
        this.height = height;
        this.radious = radious;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadious() {
        return radious;
    }

    public void setRadious(int radious) {
        this.radious = radious;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radious * radious + 2 * Math.PI * radious * height;
    }

    public double volume() {
        return Math.PI * radious * radious * height;
    }
}


public class cwh_44_ps09 {

    //problem 1
//    public static void main(String[] args) {
//        com.Cylinder myCylinder = new com.Cylinder();
//        myCylinder.setHeight(12);
//        System.out.println(myCylinder.getHeight());
//        myCylinder.setRadious(55);
//        System.out.println(myCylinder.getRadious());
//    }


    //problem 2
//    public static void main(String[] args) {
//        com.Cylinder myCylinder = new com.Cylinder();
//        myCylinder.setHeight(12);
//        System.out.println(myCylinder.getHeight());
//        myCylinder.setRadious(55);
//        System.out.println(myCylinder.getRadious());
//        System.out.println(myCylinder.surfaceArea());
//        System.out.println(myCylinder.volume());
//    }


    //problem 3
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder(12, 55);
//        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
//        myCylinder.setRadious(55);
        System.out.println(myCylinder.getRadious());
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
    }
}
