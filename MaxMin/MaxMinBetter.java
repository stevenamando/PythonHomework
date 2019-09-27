// Better MaxMin code

import java.util.*;
import java.io.*;

public class MaxMinBetter{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner fileIn = new Scanner(new File("input.txt"));
      
      int x = fileIn.nextInt();
      int y = fileIn.nextInt();
      int z = fileIn.nextInt();

      int max = 0;
      int min = x;
      
      if((x>=y) && (x>=z)){
         max = x;
      } else if ((y>=x) && (y>=z)){
         max = y;
      } else {
         max = z;
      }
      
      if(x<min){
         min = x;
      }
      if(y<min){
         min = y;
      }
      if(z<min){
         min = z;
      }
      
      System.out.println("The max is " + max);
      System.out.println("The min is " + min);
      
   }
}