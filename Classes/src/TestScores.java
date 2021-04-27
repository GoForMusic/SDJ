//8. TestScores Class
//Design a TestScores class that has fields to hold three test scores. The class should have
//
//accessor and mutator methods for the test score fields and a method that returns the aver-
//age of the test scores. Demonstrate the class by writing a separate program that creates an
//
//instance of the class. The program should ask the user to enter three test scores, which are
//stored in the TestScores object. Then the program should display the average of the scores,
//as reported by the TestScores object.

public class TestScores
{
  private double firstTestScore;
  private double secondTestScore;
  private double thirdTestScore;

  public TestScores(double firstTestScore, double secondTestScore, double thirdTestScore)
  {
    this.firstTestScore= firstTestScore;
    this.secondTestScore = secondTestScore;
    this.thirdTestScore = thirdTestScore;
  }

  public void setFirstTestScore(double firstTestScore)
  {
    this.firstTestScore = firstTestScore;
  }

  public void setSecondTestScore(double secondTestScore)
  {
    this.secondTestScore = secondTestScore;
  }

  public void setThirdTestScore(double thirdTestScore)
  {
    this.thirdTestScore = thirdTestScore;
  }

  public double getFirstTestScore()
  {
    return firstTestScore;
  }

  public double getSecondTestScore()
  {
    return secondTestScore;
  }

  public double getThirdTestScore()
  {
    return thirdTestScore;
  }

  public String toString()
  {
    double averageScore = (firstTestScore + secondTestScore + thirdTestScore) / 3;

    return String.valueOf(averageScore);
  }
}
