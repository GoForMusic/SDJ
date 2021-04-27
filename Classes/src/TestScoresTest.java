import java.util.Scanner;

//link to TestScores class
public class TestScoresTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    TestScores testScores = new TestScores(keyboard.nextDouble(), keyboard.nextDouble(), keyboard.nextDouble());


    System.out.println(testScores);

  }

}
