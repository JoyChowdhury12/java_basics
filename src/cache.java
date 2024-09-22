//import java.util.Scanner;
//
//public class cache {
//    public static void main(String[] args) {
//        System.out.println("\n\nWhat's your name ");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
//        System.out.println("Hello " + name + " have a good day");
//    }
//}

//import java.util.Scanner;
//
//public  class cache{
//    public static void main(String[] args) {
//        double kilometers;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("\n\nEnter the number to convert kilometers to miles : ");
//        kilometers = scanner.nextFloat();
//        double miles =( kilometers/1.6);
//        System.out.println( miles + " miles");
//    }
//}


import java.util.Scanner;

public  class cache{
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.hasNextInt());
    }
}