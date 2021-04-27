import java.util.Scanner;

public class TestAreaClass
{
  public static void main(String[] args)
  {
    Area area1 = new Area(2,2);
    Area area2 = new Area(0.5);
    Area area3 = new Area(3.5,5);

    System.out.println(area1);
    System.out.println(area2);
    System.out.println(area3);

    int chose=0;
    levels diff=null;

    Scanner keyboard = new Scanner(System.in);

    while(true)
    {
      System.out.print("Chose a dif 1-3: ");
      chose = keyboard.nextInt();

      switch (chose)
      {
        case 1:
          diff = levels.LOW;
          break;
        case 2:
          diff = levels.MEDIU;
          break;
        case 3:
          diff = levels.HIGH;
          break;
        default:
          throw new IllegalStateException("Unexpected value: " + chose);
      }


      switch (diff)
      {
        case LOW:
          System.out.println("Low diff");
          break;
        case MEDIU:
          System.out.println("Medium diff");
          break;
        case HIGH:
          System.out.println("High diff");
          break;
        default:
          throw new IllegalStateException("Unexpected value: " + diff);
      }
    }

  }
}
