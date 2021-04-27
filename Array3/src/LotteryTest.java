public class LotteryTest
{
  public static void main(String[] args)
  {
    Lottery lottery = new Lottery();


   int[] result = lottery.getAllTheMatching(new int[]{4,2,9,7,3});

    for(int index:result)
    {
      if(index!=0)
      System.out.print("Pozition: " + index+ " ");
    }


    System.out.println("\n"+lottery);
  }
}
