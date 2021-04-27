package Ex3;

import java.util.ArrayList;

public class ToyTest
{
  public static void main(String[] args)
  {
    ArrayList<Toy> toys= new ArrayList<Toy>();

    toys.add(new Football(18,50));
    toys.add(new Handball(18,30));
    toys.add(new Lego(3,500));


    for(Toy index:toys)
    {
      System.out.println(index.play());
    }

  }
}
