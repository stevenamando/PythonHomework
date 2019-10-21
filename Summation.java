import java.util.*;

public class Summation{
   public static void main(String[] args){   
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter a positive integer: ");
      int N = kb.nextInt();
      
      while(N <= 0){
         System.out.print("Enter a positive integer: ");
         N = kb.nextInt();
      } 
      
      int num = 1;
      int total = 0;
      
      while(num <= N){         
         if(num < N){
            System.out.print(num+"+");
         } else {
              System.out.print(num);
           }
      total += num;
      num++;
      }
      System.out.println("=" + total);
   }
}