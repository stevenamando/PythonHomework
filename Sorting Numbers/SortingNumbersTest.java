import java.util.*;
import java.io.*;

public class SortingNumbersTest{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner fin = new Scanner(new File("input.txt"));
      //pull from text file and populate array
      String[] numbers = new String[100];
      String[] words = new String[100];
      int k = 0;
      int count = 0;
      while(fin.hasNextLine()){   
         numbers[k] = fin.nextInt();
         words[k] = fin.nextLine();
         k++;
         count++;
      }
      System.out.println(Arrays.toString(numbers));
      System.out.println(Arrays.toString(words));

   }
}