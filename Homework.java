/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;
import java.util.Scanner;
/**
 *
 * @author rubenmartinez
 */
public class Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your First Name.");
        String First = scan.nextLine();
        System.out.println("Please enter your Last Name.");
        String Last = scan.nextLine();
        System.out.println("Please enter your Date of Birth (Month, Date, and Year).");
        System.out.println("Month and Date?");
        String MonthandDate = scan.nextLine();
        System.out.println("Year?");
        String Year = scan.nextLine();
        System.out.println("Please enter your age.");
        int age=scan.nextInt();
        System.out.println("Please enter your Favorite Color.");
        String Color = scan.next();
        final double mars = 0.530120481927711;
        
        System.out.printf("Hi %-15s %20s! I am so glad you used my application today. I see that your birthday is %30s. You will be turning %-8s. That will make you %-12.2f on Mars! Looking good! I will make sure your birthday cake is %17s! I hope you have a wonderful day Mr./Mrs./Ms %20s!",First,Last,MonthandDate,age+1,age*mars,Color,Last);

        
        // TODO code application logic here
    }
    
}
