package practice2;
import java.util.Scanner;
public class LoopPrintEvenNum {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scan.nextInt();

        System.out.println("for");

        int sum = 0;
        for(int i=1; i<=a; i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
