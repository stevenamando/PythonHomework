public class ArithmeticMethods{
   
   public static void main(String[] args){
      int x = add(4,2);
      int y = subtract(4,2);
      int z = multiply(x,y);
      int a = divide(z,5);
      int b = mod(-12,5);
                                    //Expected output of each line
      System.out.println("x = "+x); //x = 6
      System.out.println("y = "+y); //y = 2
      System.out.println("z = "+z); //z = 12
      System.out.println("a = "+a); //a = 2
      System.out.println("b = "+b); //b = 2
   }
      
   public static int add(int a, int b){
      return a+b;
   }
   
   public static int subtract(int a, int b){
      return add(a, -b);
   }
   
   public static int multiply(int a, int b){
      int count = 1;
      int result = 0;
      if(a==0 || b==0){
         return 0;
      }
      
      if(a > 0 && b > 0){
         while(count <= b){
            result = add(a, result);
            count = add(count, 1);
         }
         return result;
      }
      
      if(a < 0 && b < 0){
         a = abs(a);
         b = abs(b);
         while(count <=b){
            result = add(a, result);
            count = add(count, 1);
         }         
      return result;
      }
     
     a = abs(a);
     b = abs(b);
     while(count <=b){
        result = add(a, result);
        count = add(count, 1); 
     }
     return -result;
   }
   
   public static int divide(int a, int b){
      int a1 = abs(a);
      int b1 = abs(b);
      if(a1 == b){
         return 1;
      }
      if(b1 == 1){
         return a;
      }
      if(b1 == 0){
         return 0;
      }
      
      int count = 0;
      int countup = 0;
      
      boolean finish = false;
         while(!finish){
         countup = add(countup, b1);
            if(a1 < countup){
               finish = true;
            }
            else{ 
            count = add(count, 1); 
            }
         }
      if((a < 0 && b < 0) || (a > 0 && b > 0)){
         return count;
      }
                 
      return -count;      
   }
   
   public static int mod(int a, int b){
     int d = divide(a,b);
     int m = multiply(d, b);
     int result = subtract(a, m);
     return result;
      
   }
   
   public static int abs(int a){
         if(a > 0){
            return a;
         }
         a = -a;
         return a;
   }
}