import java.util.Scanner;

public  class tut5{
    public  static  void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number of 5 subjects");
        System.out.println("English : ");
        float a = sc.nextFloat();
        System.out.println("Mathematics : ");
        float b = sc.nextFloat();

        System.out.println("Physics : ");
        float c = sc.nextFloat();

        System.out.println("Chemistry : ");
        float d = sc.nextFloat();

        System.out.println("Biology : ");
        float e = sc.nextFloat();

        float sum = a+b+c+d+e;
        System.out.println("Your total marks is : ");
        System.out.println(sum);
        float total = 500;
        float perc = (sum/total)*100;
        System.out.println(perc);
    }
}