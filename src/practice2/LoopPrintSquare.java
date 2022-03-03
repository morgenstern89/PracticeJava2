package practice2;
import java.util.Scanner;

public class LoopPrintSquare {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scan.nextInt();

        System.out.println("for");
        for(int i=1; i<=a; i++){
            System.out.print(i*i+" ");
        }

        System.out.println();
        System.out.println("while");
        int i = 1;
        while (i<=a){
            System.out.print(i*i + " ");

            i++;
        }

        int j = 1;
        System.out.println();
        System.out.println("do while");
        do{
            System.out.print(j*j+" ");

            j++;
        }while (j<=a);
    }
}
