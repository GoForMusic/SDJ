//Exercise 1.06 Write a program that calculates and prints the circumference and area of a
//circle with radius 22.5. (Hint: The circumference of a circle is 2πr, the area is
//πr
//2
//. The expression Math.PI gives a value for π).

public class CircumferenceAndArea
{
  public static void main(String[] args)
  {
    double radius = 22.5;

    double circumference = 2*Math.PI*radius;
    double area = Math.PI*(radius*radius);

   System.out.println("circumference: " + circumference);
   System.out.println("area: " + area);
  }
}
