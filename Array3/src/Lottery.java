import java.util.ArrayList;

public class Lottery
{
  private ArrayList<Integer> lotteryNumbers;

  public Lottery(){
    lotteryNumbers = new ArrayList<Integer>(5);
    for(int index=0;index<5;index++)
    {
      int localInt = (int)(10*Math.random());
      lotteryNumbers.add(localInt);
    }
  }

  public int getElement(int index)
  {
    return lotteryNumbers.get(index);
  }

  private boolean isMatching(int[] userarray, int index)
  {
    if(lotteryNumbers.get(index) == userarray[index]) return true;
      else return false;
  }

  public int[] getAllTheMatching(int[] userarray)
  {
    int[] localArray=new int[lotteryNumbers.size()];

    for(int index=0; index<lotteryNumbers.size();index++)
    {
      if(isMatching(userarray,index)) localArray[index]=index+1;
    }
      return localArray;
  }

  public String toString()
  {
    String localString=lotteryNumbers.toString();

    return localString;
  }


}
