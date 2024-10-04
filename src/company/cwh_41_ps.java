package company;

import java.util.Random;
import java.util.Scanner;

public class cwh_41_ps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter rock for 0 , paper for 1 , scissor for 2");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("Draw");
        } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
            System.out.println("You Win!");

        } else {
            System.out.println("Computer win!");
        }
        if (computerInput == 0) {
            System.out.println("Computer's choice is : Rock");
        } else if (computerInput == 1) {
            System.out.println("Computer's choice is : Paper");
        } else if (computerInput == 2) {
            System.out.println("Computer's choice is : Scissor");
        }
    }
}
