public class FractionProgram{
   public static void main(String[] args){
      Fraction[] f = new Fraction[6];
      
      f[0] = new Fraction(1,2);   //f[0] = 1/2
      f[1] = f[0].multiply(f[0]); //f[1] = 1/4
      f[2] = f[0].add(f[1]);      //f[2] = 6/8
      f[3] = f[2].divide(f[1]);   //f[3] = 12/4
      f[4] = f[0].subtract(f[1]); //f[4] = 1/4
      f[5] = new Fraction(4);     //f[5] = 4/1
      
      for(int i=0; i<f.length; i++){
         System.out.println(f[i]); //should print the fraction in the form of numerator/denominator
      }
      System.out.println();
      f = sort(f);
      
      for(int i=0; i<f.length; i++){
         System.out.println(f[i]); //should print the fraction in the form of numerator/denominator
      }
   }
   
   public static Fraction[] sort(Fraction[] f){
      for(int i=0; i<f.length; i++){
         for(int j=i+1; j<f.length; j++){
            if(f[j].compareTo(f[i]) < 0){
               Fraction temp = f[i];
               f[i] = f[j];
               f[j] = temp;
            }
         }
      }
      return f;
   }
}
   
   class Fraction{
      int numerator = 1;
      int denominator = 2;
      
      public Fraction(int n){
         numerator = n;
         denominator = 1;
      }
      
      public Fraction(int n, int d){
         numerator = n;
         denominator = d;
      }
      
      public Fraction multiply(Fraction f){
         int newNumerator = numerator * f.numerator;
         int newDenominator = denominator * f.denominator;
         return new Fraction(newNumerator, newDenominator);
      }
      
      public Fraction add(Fraction f){
         int newNumerator = (numerator * f.denominator) + (f.numerator * denominator);
         int newDenominator = denominator * f.denominator;
         return new Fraction(newNumerator, newDenominator);
      }
      
      public Fraction subtract(Fraction f){
         int newNumerator = (numerator * f.denominator) - (denominator * f.numerator);
         int newDenominator = (denominator * f.denominator);
         return new Fraction(newNumerator, newDenominator);
      }
      
      public Fraction divide(Fraction f){
         int newNumerator = numerator * f.denominator;
         int newDenominator = denominator * f.numerator;
         return new Fraction(newNumerator, newDenominator);
      }
      
      public String toString(){
         return numerator+"/"+denominator;
      }
      public int compareTo(Fraction f){
         return(f.denominator * numerator)-(denominator*f.numerator);
      }
   }