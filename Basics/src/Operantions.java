//Exercise 1.07 Determine the order of evaluation of the operators in each of the following
//Java statements, and try to figure out what the value of x, y, and z will be.
//Then check if you were right by implementing a Ja

public class Operantions
{
  public static void main(String[] args)
  {
     int x = 7 + 3 * 6 / 2 - 1; //x=15 | will be 3*6,18/2, 7+9, 16-1
     int y = 2 % 2 + 2 * 2 - 2 / 2; // y=3 | will be 2%2, 2*2, 2/2, 1+2
     int z = (3 * 9 * ( 3 + ( 9 * 3 / ( 3 ) ) ) );//z = 324 | 9*3, 27/3, 3+9, 3*9*12

     System.out.println("x:"+x+" y:"+y+" z:"+ z);

  }
}
