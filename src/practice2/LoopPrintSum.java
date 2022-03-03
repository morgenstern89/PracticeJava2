package practice2;
import java.util.Scanner;
public class LoopPrintSum {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scan.nextInt();

        System.out.println("for");

        int sum = 0;
        for(int i=1; i<=a; i++){
            sum += i;
        }
        System.out.print(sum);
    }
}