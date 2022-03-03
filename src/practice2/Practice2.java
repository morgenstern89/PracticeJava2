package practice2;
import java.util.Scanner;

//1. Print out weekdays using "switch".
public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weekday");
        String dayOfTheWeek = scan.next();

        switch (dayOfTheWeek) {
            case "MON":
                System.out.println("Monday");
                break;
            case "TUE":
                System.out.println("Tuesday");
                break;
            case "WED":
                System.out.println("Wednesday");
                break;
            case "THU":
                System.out.println("Thursday");
                break;
            case "FRI":
                System.out.println("Friday");
                break;
            case "SAT":
                System.out.println("Saturday");
                break;
            case "SUN":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("not a valid day");
        }
    }
}