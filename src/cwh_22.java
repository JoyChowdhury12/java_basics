import java.util.Scanner;

public class cwh_22 {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = 0;
        do {
            j++;
            System.out.println(j);
        } while (j < n);
    }
}
