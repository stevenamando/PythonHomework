import java.util.*;
import java.io.*;

public class ArrayStatsAdvanced{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner fin = new Scanner(new File("input.txt"));
      //pull from text file and populate array
      int[] numbers = new int[1000];
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
      
      //call methods
      int min = minMethod(numbers, count);
      int max = maxMethod(numbers, count);
      int mode = modeMethod(numbers, count);
         
      //mean
      double total = 0;
      
      for(int cnt = 0; cnt < count; cnt++){
         total += numbers[cnt];
      }
      
      double mean = total / count;
         
      //median
      double median;
      if(count % 2 == 0){
         median = (numbers[count/2] + numbers[(count/2)-1]) / 2.0;
      }
      else{
         median = numbers[(count / 2)];
      }  
      
      //print solutions
      System.out.println("min=" + min); 
      System.out.println("max=" + max);
      System.out.printf("mean=%.1f\n", mean);
      System.out.printf("median=%.1f\n", median);
      System.out.println("mode=" + mode);
      //printArray(numbers, count);
      
   }
   
   /* print array test
      public static void printArray(int[] a, int count){
      System.out.print("(");
      for(int i=0; i<count-1; i++){
         System.out.print(a[i] + ",");
      }
      System.out.println(a[count-1] + ")");
   }
   */
     
   public static int minMethod(int[] a, int count){ 
      int minInt = a[0]; 
      for(int i=1;i<count;i++){ 
         if(a[i] < minInt){ 
          minInt = a[i]; 
         } 
      } 
    return minInt; 
  } 
   
   public static int maxMethod(int[] b, int count){ 
      int maxInt = b[0]; 
      for(int i=1;i < count;i++){ 
         if(b[i] > maxInt){ 
            maxInt = b[i]; 
         } 
      } 
    return maxInt;
     
  }
  
  public static int modeMethod(int[] c, int count){   
      int mode = c[0];
      int countMax = 0;
      int length = count;     
      for(int i = 0; i < length; i++){
         int value = c[i];
         int countMode = 0;
         for(int j = 0; j < length; j++){
            if(c[j] == value){
               countMode++;
            }
            if(countMode > countMax){
               mode = value;
               countMax = countMode;
            }
         }
      }
      if(countMax >= 1){
         return mode;
      }
      return 0;
   }      
}
