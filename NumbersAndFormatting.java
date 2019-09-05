public class NumbersAndFormatting {
   public static void main(String[] args) {
   int x = 4;
   int y = 2;
   double radius = 3.7;
   double pi = 3.14;
   System.out.println("x+y=" + (x + y));
   System.out.printf("y+radius=%.2f\n", (y + radius));
   System.out.println("x/y=" + (x/y));
   System.out.println("x%y=" + (x%y));
   System.out.println("y%x=" + (y%x));
   System.out.printf("radius/x=%.2f\n", (radius/x));
   System.out.printf("The area of a circle with radius %.2f is %.2f", radius, (pi*(radius*radius)));
   }
}