package Day_15;
import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month (1-12):");
        int month = sc.nextInt();
        

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//                days = 31;
                System.out.println("Days 31");
                break;
            case 4: case 6: case 9: case 11:
//                days = 30;
            	 System.out.println("Days 30");
                break;
            case 2:
            	 System.out.println("Enter the year:");
                 int year = sc.nextInt();
                 
                if ( year % 4 == 0 ) {
                    System.out.println("Days 29");
                } else {
                    System.out.println("Days 28");
                }
                break;
            default:
                System.out.println("Invalid month!");
     
        }

        
    }
}
