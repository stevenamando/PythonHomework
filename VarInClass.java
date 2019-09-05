import java.util.Scanner;
//import.java.util.* -> grab everything in java.util

public class VarInClass {
   public static void main(String[] args) {
   Scanner keyboard = new Scanner(System.in);
   System.out.print("Enter an integer: ");
   int x = keyboard.nextInt(); 
   System.out.println("x = "+x);  
   }
}   