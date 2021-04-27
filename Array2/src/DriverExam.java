import java.util.Scanner;

public class DriverExam
{
  private char[] answers = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D',
      'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
  private char[] inputs = {'B', 'D', 'A', 'A', 'A', 'B', 'D', 'A', 'C', 'D',
      'B', 'C', 'A', 'A', 'C', 'C', 'C', 'B', 'D', 'B'};

  public void setInputs()
  {
    Scanner keyboard = new Scanner(System.in);
    for(int index=0;index<inputs.length;index++)
    {
      System.out.print("Enter the answer for question no. "+(index+1));
      String localString = keyboard.nextLine();
      this.inputs[index] = localString.charAt(0);
    }
  }

  public boolean passed()
  {
    int sum = 0;

    for (int index = 0; index < answers.length; index++)
    {
      if (this.answers[index] == this.inputs[index])
        sum++;
    }

    if (sum >= 15)
      return true;
    else
      return false;
  }

  public int totalCorrect()
  {
    int sum = 0;

    for (int index = 0; index < answers.length; index++)
    {
      if (this.answers[index] == this.inputs[index])
        sum++;
    }

    return sum;
  }

  public int returnIncorrect()
  {
    int sum = 0;

    for (int index = 0; index < answers.length; index++)
    {
      if (this.answers[index] != this.inputs[index])
        sum++;
    }

    return sum;
  }

  public int[] questionsMissed()
  {
    int[] localArray = new int[answers.length];

    for (int index = 0; index < answers.length; index++)
    {
      if (this.answers[index] != this.inputs[index]) localArray[index] = index+1;

    }

    return localArray;
  }
}
