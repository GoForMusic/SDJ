public class Array7
{
  public static void main(String[] args)
  {
    int[] golfTournament = {3,5,1,3,3,2,4,2,3};

    int totalNumbers=0;
    int holeInOne=0;

    for(int index=0;index< golfTournament.length;index++)
    {
      totalNumbers = totalNumbers + golfTournament[index];

      if(golfTournament[index] == 1) holeInOne++;

    }

    double avarage = (double)totalNumbers/ golfTournament.length;

    System.out.println("The total number of hits: " + totalNumbers);
    System.out.println("The average hits per hole: " + avarage);
    System.out.println("The number of Hole-in-Ones: "+ holeInOne);

  }
}
