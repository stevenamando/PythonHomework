import java.util.*;

public class GeoHelp{
   private static Scanner kb = new Scanner(System.in);
   
   public static void main(String[] args){   
      System.out.println("What would you like help with?");
      System.out.println("1) Circle");
      System.out.println("2) Square");
      System.out.println("3) Rectangle");
      System.out.println("4) Triangle");
      System.out.print("Enter your choice: ");
      int choice = kb.nextInt();
      if(choice == 1){
         circleHelp();
      }
      if(choice == 2){
         squareHelp();
      }
      if(choice == 3){
         rectHelp();
      }
      if(choice == 4){
         triangleHelp();
      }
   }
   
   public static void circleHelp(){
      System.out.print("Enter the radius of the circle: ");
      double radius = kb.nextDouble();
      double area = radius * radius * Math.PI;
      double circ = 2 * radius * Math.PI;
      System.out.printf("Area = %.2f \nCircumference = %.2f", area, circ);
   }
   
   public static void squareHelp(){
      System.out.print("Enter the length of the side: ");
      double side = kb.nextDouble();
      double area = side * side;
      double perimeter = 4 * side;
      System.out.printf("Area = %.2f \nPerimeter = %.2f", area, perimeter);
   }
   
   public static void rectHelp(){
      System.out.print("Enter the length of the side: ");
      double length = kb.nextDouble();
      System.out.print("Enter the width of the side: ");
      double width = kb.nextDouble();
      double area = length * width;
      double perimeter = length + length + width + width;
      System.out.printf("Area = %.2f \nPerimeter = %.2f", area, perimeter);
   }
   
   public static void triangleHelp(){
      System.out.print("Enter the length of the base: ");
      double base = kb.nextDouble();
      System.out.print("Enter the height: ");
      double height = kb.nextDouble();
      double area = (.5) * base * height;
      System.out.printf("Area = %.2f", area);
   }
}