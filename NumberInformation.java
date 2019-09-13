// Number Information Homework - Steven Barnas
import java.util.Scanner;

public class NumberInformation {
   public static void main(String[] args) {
   Scanner keyboard = new Scanner(System.in);
   System.out.print("What is your favorite integer? ");
   int x = keyboard.nextInt();
   System.out.println("You entered " + x + " as your number.");
      if(x == 42){
         System.out.println("I like the number 42 also!");
      }         
      
      if(x%2 == 0){
         System.out.println("Your number is even.");
      } 
      else {
         System.out.println("Your number is odd.");
      }      
     
      if(x > 0){
         System.out.println("Your number is positive.");
      } 
      else if(x < 0){
         System.out.println("Your number is negative.");
      }
      else{
         System.out.println("Your number is zero.");
      }         
   }
}