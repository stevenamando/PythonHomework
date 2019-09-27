// Min & Max Methods Homework Steven Barnas

import java.util.*;
import java.io.*;

public class MaxMinMethods{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner fileIn = new Scanner(new File("input.txt"));
      
      int x = fileIn.nextInt();
      int y = fileIn.nextInt();
      int z = fileIn.nextInt();
      
      int maxvalue = findMax(x, y, z);
      int minvalue = findMin(x, y, z);
      System.out.println("For the set (" + x + ", " + y + ", " + z + ") the maximum value is " + maxvalue + ", and " + minvalue + " is the minimum value.");
   }
   
   public static int findMax(int x, int y, int z){
      int max = 0;
      if((x>=y) && (x>=z)){
         max = x;
      } else if ((y>=x) && (y>=z)){
         max = y;
      } else {
         max = z;
      }
      return max;
   }
   
   public static int findMin(int x, int y, int z){
      int min = x;
      if(x<min){
         min = x;
      }
      if(y<min){
         min = y;
      }
      if(z<min){
         min = z;
      }
      return min;  
 }  
}      
     
