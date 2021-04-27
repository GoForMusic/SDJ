public class TesttestScore
{
  public static void main(String[] args)
  {
    int[] scores = {0,10,3,20,30,90,100};
    TestScores testScores = new TestScores(scores);
    System.out.println(testScores.average());
  }
}
