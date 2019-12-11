import java.util.*;
import java.io.*;

public class SortingNumbers{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner fin = new Scanner(new File("input.txt"));
      //pull from text file and setup arrays
      int[] numbers = new int[100];
      String[] words = new String[100];
      String[] tempArray = new String[100];
      String tempString = "";
      String tempNumber = "";
      String tempWords = "";
      int k = 0;
      int count = 0;
      //populate tempArray
      while(fin.hasNextLine()){   
         tempArray[k] = fin.nextLine();
         k++;
         count++;
      }
      int l = 0;
      //split integer and strings
      tempString = tempArray[l];
         for(int j = 0; j < count; j++){
            for(int i = 0; i < tempString.length(); i++){
               char ch[] = tempString.toCharArray();
               if(ch[i] >= '0' && ch[i] <= '9'){
                  tempNumber += ch[i];
               }
               if(ch[i] == 45 || (ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z')){
                  tempWords += ch[i];
               }
            }
         //convert pulled number (still string) to int
         numbers[j] = Integer.parseInt(tempNumber);
         words[j] = tempWords;
         tempNumber = "";
         tempWords = ""; 
         l++;
         tempString = tempArray[l];
         }         
               
      //sort array numerically
      int tempNumArray;
      String tempWordsArray;
      for(int i = 0; i < count; i++){
         for(int m = i+1; m < count; m++){
            if(numbers[i] > numbers[m]){
               tempNumArray = numbers[i];
               tempWordsArray = words[i];
               numbers[i] = numbers[m];
               words[i] = words[m];
               numbers[m] = tempNumArray;
               words[m] = tempWordsArray;
            }
         }
         System.out.println(numbers[i] + " " + words[i]);
      }
      
      System.out.print("\n");
      //sort array alphabetically
      int secondTempNumArray;
      String secondTempWordsArray;
      for(int i = 0; i < count; i++){
         for(int n = i+1; n < count; n++){
            if(words[i].compareTo(words[n]) > 0){
               secondTempWordsArray = words[i];
               secondTempNumArray = numbers[i];
               words[i] = words[n];
               numbers[i] = numbers[n];
               words[n] = secondTempWordsArray;
               numbers[n] = secondTempNumArray;
            }
         }
         System.out.println(numbers[i] + " " + words[i]);
      }
      
      //System.out.println(Arrays.toString(numbers));
      //System.out.println(Arrays.toString(words));  
      
   }   
}
      
