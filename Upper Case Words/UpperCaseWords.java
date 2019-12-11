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

   public static String toCaps(String str){
      char ch[] = str.toCharArray();
      for(int i = 0; i < str.length(); i++){
         if(i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i-1] == ' '){
            if (ch[i] >= 'a' && ch[i] <= 'z'){
               ch[i] = (char)(ch[i] - 'a' + 'A');
            }
         }
      else if (ch[i] >= 'A' && ch[i] <= 'Z')
         ch[i] = (char)(ch[i] + 'a' - 'A');
      }
      String st = new String(ch); 
        return st;
   }
  
            
/*    
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
*/

} 