    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;
import java.util.Scanner;
/**
 *
 * @author rubenmartinez
 */
public class Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  

    Scanner scan=new Scanner(System.in);
    String w;
    
    do{
System.out.println("1. Add"); 
System.out.println("2. Subtract");
System.out.println("3. Multiply");
System.out.println("4. Divide");
System.out.println("5. Power");
System.out.println("6. Root");
System.out.println("7. Modulus");
System.out.println("Please Enter the number of the menu option that corresponds\n "
        + "to the operation you'd like to perform?");

int x=scan.nextInt();
System.out.println("Please enter the first Number?");
int a=scan.nextInt();
System.out.println("Please enter the second Number?");
int b=scan.nextInt();
switch(x){
   case 1:
        System.out.printf("%s + %s = ",a,b);
        System.out.println(a+b);
        break;
    
    case 2:
        System.out.printf("%s - %s = ",a,b);
        System.out.println(a-b);
        break;
    case 3:
        System.out.printf("%s * %s = ",a,b);
        System.out.println(a*b);
        break;
    case 4:
        System.out.printf("%s / %s = ",a,b);
        System.out.println(a/b);
        break;
    case 5:
        System.out.printf("%s ^ %s = ",a,b);
        System.out.println(Math.pow(a,b));
        break;
    case 6:
        System.out.printf("%s √ %s = ",a,b);
        System.out.println(a*Math.sqrt(b));
        break;
    case 7:
        System.out.printf("%s %% %s = ",a,b);
        System.out.println(a%b);
        break;
    default:
        System.out.println("Invalid Input");
        
    }
    
System.out.println("Would you Like to perform another calculation? Y/N");
    w = scan.next().toUpperCase();
    }
while(w.equals("Y"));

    if(w.equals("N"))
{
    System.out.println("Thankyou Goodbye");
}else{
        
        System.out.println("Invalid Input");
}
    }
   }
   
        
       
        
    


// TODO code application logic here
   
    
        
