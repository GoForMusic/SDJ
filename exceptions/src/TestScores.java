public class TestScores
{
  private int[] scores;

  public TestScores(int[] arg)
  {
    scores = arg;
  }

  public double average()
  {
    int Sum=0;

    for(int index=0;index<scores.length;index++)
    {
      if(scores[index]<0 || scores[index]>100)
      {
        throw new InvalidTestScore(index,scores[index]);
      }else
      Sum+= scores[index];
    }

    return (double)Sum/scores.length;
  }

}
