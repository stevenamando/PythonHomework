import java.util.Scanner;
import java.io.*;

public class ArrayStatsBasic{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner fin = new Scanner(new File("input.txt"));
      double[] numbers = new double[10];
      for(int i = 0; i < numbers.length; i++){
         numbers[i] = fin.nextDouble();
      }
      double max = numbers[0];
      double min = numbers[0];
      double total = 0;
      
      for(int cnt = 0; cnt < numbers.length; cnt++){
         total += numbers[cnt];
      }
      
      double mean = total / numbers.length;
      
      for(int cnt = 1; cnt < numbers.length; cnt++){
         if(numbers[cnt] > max){
            max = numbers[cnt];   
         }
         if(numbers[cnt] < min){
            min = numbers[cnt];
         }
      }
      System.out.printf("min=%.2f\n", min);
      System.out.printf("max=%.2f\n", max);
      System.out.printf("mean=%.2f", mean);
   }
}
      