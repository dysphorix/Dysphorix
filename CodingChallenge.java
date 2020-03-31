// Code reviewed by @professorgordon
public class CodingChallenge
{
      //Gerardo Steve Lopez
      
   public static void main (String[]args)
   {
   double a =252.12;
   double b =310.14;
   double c = a * b;
   System.out.println("*******************");   //Part One
   System.out.println("*\t\t\t*\t\t\t*");
   System.out.println("*\t\t\t*\t\t\t*");
   System.out.println("*******************\n");
   System.out.printf("%.2f times %.2f equals %,.4f.\n\n", a, b, c);   //Part Two
   System.out.printf("%,.4f negated is %,.4f.\n", c, -c);   //Part Three
   }
}
