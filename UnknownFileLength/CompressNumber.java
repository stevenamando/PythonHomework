import java.util.Scanner;
import java.io.*;

public class CompressNumber{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner fileIn = new Scanner(new File("input.txt"));
      
      while(fileIn.hasNextInt()){
         int number = fileIn.nextInt();
         int remainder;
         int sum = 0;
         int temp;
         temp = number;
         
         if(number == 0){
            System.out.println(temp + " compressed to " + 0);
         }
          
         else if(number % 9 == 0){
            System.out.println(temp + " compressed to " + 9);
         }
 
         else if(number < 0){
            System.out.println(temp + " compressed to " + -1);
         }
         
         else{        
            number = number % 9;
            System.out.println(temp + " compressed to " + number);
         }
      }
   }
}
