package practice2;
import java.util.Scanner;
public class CalcAverage {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scan.nextInt();

        System.out.println("for");
        int sum = 0;
        double avg = 1;
        for (int i = 1; i<=a; i++){
            sum +=i; //sum = sum+i
        }
        avg = sum/a;
        System.out.println(avg);
    }
}
