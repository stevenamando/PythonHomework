import java.util.Scanner;
//import.java.util.* -> grab everything in java.util

public class VarInHW {
   public static void main(String[] args) {
   Scanner keyboard = new Scanner(System.in);
   System.out.print("What is your favorite number? ");
   int x = keyboard.nextInt();
   double y = x; 
   System.out.println("Your favorite number is " + x); 
   System.out.println("Your favorite number doubled is " + (x*2));
   System.out.println("Your favorite number squared is " + (x*x));
   System.out.println("The negative of your favorite number is " + (x*-1));
   System.out.printf("The inverse of your favorite number is %.3f \n", (1/y));
   }
}   