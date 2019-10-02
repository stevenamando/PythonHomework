
public class quadratictester {
   public static void main(String[] args) {
   double a = 1;
   double b = -4;
   double c = 4.0;
   double solplus1 = (-b + (Math.sqrt((b*b)-4*a*c)))/(2*a);
   double solplus2 = (-b - (Math.sqrt((b*b)-4*a*c)))/(2*a);
   System.out.println(solplus1 + ", " + solplus2);
   }
}
