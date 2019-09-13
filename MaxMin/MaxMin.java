//MaxMin Homework - Steven Barnas

import java.util.*;
import java.io.*;

public class MaxMin{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner fileIn = new Scanner(new File("input.txt"));
      
      int x = fileIn.nextInt();
      int y = fileIn.nextInt();
      int z = fileIn.nextInt();
            
      if(x == y){
         if(x > z){
            System.out.println("The max value is " + x);
            System.out.println("The min value is " + z);
         }
         else{
            System.out.println("The max value is " + z);
            System.out.println("The min value is " + x);   
         }
      }           
      else if(x == z){
         if(y > x){
            System.out.println("The max value is " + y);
            System.out.println("The min value is " + x);           
         }
      }
      else if (y == z){
         if(x > y){
            System.out.println("The max value is " + x);
            System.out.println("The min value is " + y);
         }
      }               
      
      if(x > y){
         if(x > z){
            if(y > z){
               System.out.println("The max value is " + x);
               System.out.println("The min value is " + z);
            }
            else{
               System.out.println("The max value is " + x);
               System.out.println("The min value is " + y);
            }   
         }
         else {
            System.out.println("The max value is " + z);
            System.out.println("The min value is " + y);
         }   
      }         

      if(y > x){
         if(y > z){
            if(x > z){
            System.out.println("The max value is " + y);
            System.out.println("The min value is " + z);
            }
            else if(x < z){
            System.out.println("The max value is " + y);
            System.out.println("The min value is " + x);
            }
         }   
         else {
            System.out.println("The max value is " + z);
            System.out.println("The min value is " + x); 
         }
      }
      
      //This line is to show you the numbers if you wish to uncomment it out.
      //System.out.println("x = "+x+" y = "+y+" z = "+z); 
   }
}
