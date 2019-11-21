import java.util.*;
import java.io.*;

public class MissingNumbers{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner fin = new Scanner(new File("input.txt"));
      //pull from text file and populate array
      int size = fin.nextInt();
      int[] numbers = new int[size];
      int i = 0;
      int count = 0;
      while(fin.hasNextInt()){
         numbers[i++] = fin.nextInt();
         count++;
      }  
      
      //sort array
      int temp;
      for(i = 0; i < count; i++){
         for(int j = i+1; j < count; j++){
            if(numbers[i] > numbers[j]){
               temp = numbers[i];
               numbers[i] = numbers[j];
               numbers[j] = temp;
            }
         }
      }      
      
      //register array
      int[] register = new int[numbers.length];
      
      for(i = 0; i < numbers.length; i++){
         if(numbers[i] > 0){
            register[numbers[i]-1] = 1;
         }
      }     
      
      //print missing numbers
      for(i = 0; i < register.length; i++){
         if(register[i] == 0){
            System.out.print(i+1 + " ");
         }
      }
      /*
      System.out.println(Arrays.toString(numbers));
      System.out.println(Arrays.toString(register));
      */
   }
}