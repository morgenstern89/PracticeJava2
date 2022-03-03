package practice2;
import java.util.Scanner;

//3. Using for loop print number from 1 to 5.

public class LoopOneToFive {
    public static void main (String[] args){
        System.out.println("for");
        for(int i=5; i>0; i--){
           System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("while");
        int i = 5;
        while(i>0){
            System.out.print(i+ " ");
            i--;
        }

        int j =5;

        System.out.println();
        System.out.println("do while");
        do{
            System.out.print(j + " ");
            j--;
        }while(j>0);
    }

}
