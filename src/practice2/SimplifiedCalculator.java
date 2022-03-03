package practice2;
import java.util.Scanner;

//2. Simplified calculator using "switch".
public class SimplifiedCalculator {
        public static void calc(int a, int b, char op){
            switch (op){
                case '*':
                    System.out.println("a*b= "+(a*b));
                    break;
                case '-':
                    System.out.println("a-b= "+(a-b));
                    break;
                case '+':
                    System.out.println("a+b= "+(a+b));
                    break;
                case '/':
                    System.out.println("a/b= "+(a/b));
                    break;
                default:
                    System.out.println("Not valid operation.");
            }
        }
        public static void main(String [] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter first number");
            int a = scan.nextInt();
            System.out.println("Enter second number");
            int b = scan.nextInt();

            System.out.println("Enter op");
            char op = scan.next().charAt(0);//will get the first character of the string.

            calc(a,b,op);
        }
    }

