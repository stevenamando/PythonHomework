import java.util.*;
import java.io.*;

public class AlphanumericCount{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner fin = new Scanner(new File("input.txt"));
      //pull from text file      
	   
      String total = "";
      while(fin.hasNextLine()){
         total += fin.nextLine();
      }      
      String UpperStr = total.toUpperCase();
      
	   int len = UpperStr.length(); 
	         
      //ascii value array
	   char ascii[] = new char[36];
      int index = 0; 
      
      for(char i = 'A'; i < '['; i++){
         ascii[index++] = i;
      }
      index = 26;
      for(char i = '0'; i < ':'; i++){
         ascii[index++] = i;
      }
      
      int counter[] = new int[36];   
      
      for(int i = 0; i < len; i++){
         for(int j = 0; j < ascii.length; j++){
            if(UpperStr.charAt(i) == ascii[j]){
               counter[j]++;
            }
         }
      }
      
      for(int i = 0; i < ascii.length; i++){
         System.out.println(ascii[i] + " = " + counter[i]);
      } 
   } 
}