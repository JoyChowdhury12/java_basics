public class cwh25_practice_set {
    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }


//        int sum = 0;
//        int n = 3;
//        for (int i = 0; i < n; i++) {
//            sum = sum + (2 * i);
//        }
//        System.out.println("Sum of the even number is : ");
//        System.out.println(sum);

//        int n = 10;
//        int m = 5;
//        System.out.printf("\nThe multiplication of %d is : \n", m);
//        for (int i = 1; i <= n; i++) {
//            System.out.printf("\n%d X %d = %d\n", m, i, (m * i));
//        }

//        int n = 10;
//        int m = 10;
//        System.out.printf("\nThe multiplication of %d in reverce order is : \n", m);
//        for (int i = n; i >= 1; i--) {
//            System.out.printf("\n%d X %d = %d\n", m, i, (m * i));
//        }

//        int n = 5, factorial = 1, i = 1;
//        while (i <= n) {
//            factorial = factorial * i;
//            i++;
//        }
//        System.out.printf("\nThe factorial number is : %d\n", factorial);


        int n = 10;
        int m = 8;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (m * i);
        }
        System.out.printf("\nThe sum of the multiplication is : %d \n", sum);


    }
}
