import java.util.InputMismatchException;
import java.util.Scanner;
public class MathTest
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int x = 0;
    int y=0;

    while(true){
      try{
        System.out.println("Enter x: ");
        x = scanner.nextInt();
        System.out.println("Enter y: ");
        y = scanner.nextInt();
      }catch (NullPointerException e){
        e.printStackTrace();
      }

      System.out.println("x + y = " + (x + y));
      System.out.println("x - y = " + (x - y));
      System.out.println("x / y = " + (x / y));
      System.out.println("x * y = " + (x * y));

    }
  }
}