import java.util.*;
import java.io.*;

public class UpperCaseWords{ 
   public static void main(String args[]) throws FileNotFoundException{ 
      Scanner fin = new Scanner(new File("input.txt"));
      while(fin.hasNextLine()){
         String line = fin.nextLine();
         line = line.toLowerCase();
         System.out.println(toCaps(line));
      }
    } 
    
    public static String toCaps(String str) { 
        StringBuffer s = new StringBuffer(); 
        char ch = ' '; 
        for (int i = 0; i < str.length(); i++) { 
            if (ch == ' ' && str.charAt(i) != ' ') 
                s.append(Character.toUpperCase(str.charAt(i))); 
            else
                s.append(str.charAt(i)); 
            ch = str.charAt(i); 
        } 
        return s.toString().trim(); 
    } 
} 