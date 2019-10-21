import java.util.*;
import java.io.*;

public class UnknownFileInputLength{
   public static void main(String[] args) throws FileNotFoundException{
      //This line allows reading a file called input.txt
      //Make sure you have input.txt in the same directory as the .java file
      Scanner fileIn = new Scanner(new File("input.txt"));

      //This line will check to see if there is another integer in the file
      //If there is it will return True
      
      while(fileIn.hasNextInt()){
         int number = fileIn.nextInt();         
            if(number == 0){
               System.out.println(number + "-");
            }
            
            if(number > 0){
               System.out.print(number + "-");
               for(int c = 0; c < number; c++){
                  System.out.print("*");
               }
               System.out.println();             
            }
            
            if(number < 0){
               System.out.print("");
            }
      }
   }
}
