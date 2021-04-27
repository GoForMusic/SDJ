//Exercise 10.03

import java.util.Scanner;

public class Loop8
{
  public static void main(String[] args)
  {
    double a=1, aa=0, b=Math.pow(2,-.5), t=.25, p=1, result=0;

    Scanner keyboard = new Scanner(System.in);


      System.out.print("Type hoe many loops to have: ");
      int iterations = keyboard.nextInt();

      for(int index=0;index<iterations;index++)
      {
        aa=(a+b)/2;
        b=Math.pow((a*b),.5);
        t=t-p*Math.pow((a-aa),2);
        p=2*p;
        result=(Math.pow((a+b),2))/(4*t);
        a=aa;
      }

      System.out.println(result);
      System.out.println(Math.PI);


  }
}
