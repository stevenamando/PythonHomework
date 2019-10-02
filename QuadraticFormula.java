// Quadratic Formula Homework - Steven Barnas

public class QuadraticFormula {
   public static void main(String[] args) {
   double a = 1;
   double b = -1;
   double c = -6;
   double plus = solutionPlus(a, b, c);
   double minus = solutionMinus(a, b, c);
   printSolutions(plus, minus, 2);
     
   }
   
   public static double solutionPlus(double a, double b, double c){
      if(a == 0){
         return 0;
      }
      if(((b*b) - (4*a*c)) < 0){
         return 0;
      }
      return (-b + (Math.sqrt(b*b - 4*a*c))) / (2*a);
   }
   
   public static double solutionMinus(double a, double b, double c){
     if(a == 0){
         return 0;
     }
     if(((b*b) - (4*a*c)) < 0){
         return 0;
     }
     return (-b - (Math.sqrt(b*b - 4*a*c))) / (2*a);
   }
     
   public static void printSolutions(double a, double b, int d){
     if(a == 0 && b == 0){ 
      System.out.println("The equation has no real solutions.");
     }     
     else if(a == b){
      System.out.printf("The equation has a solution of %."+d+"f", a);
     } 
     else{
      System.out.printf("The equation has the solutions of (%."+d+"f,%."+d+"f).", a, b);
     }
   }
}
