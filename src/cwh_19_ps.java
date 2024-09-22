import java.util.Scanner;

public class cwh_19_ps {
    public static void main(String[] args) {
//        System.out.println("\nEnter a Website Name : ");
//        String website = sc.next();
//        if (website.endsWith(".com")) {
//            System.out.println("This is a Commercial Website");
//        } else if (website.endsWith(".org")) {
//            System.out.println("This is an Organizational Website");
//        } else if (website.endsWith(".bd")) {
//            System.out.println("This is a Bangladeshi Website");
//        }
//

        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
