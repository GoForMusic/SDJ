public class Test2001
{
  public static void main(String[] args)
  {
    Bicycle bicycle = new Bicycle("Adrian", 300, 2);

    System.out.println(bicycle);

    SportsCar car1 = new SportsCar("Andrei", 444444, "ADR1", 25052);
    Van car2 = new Van("Andrei2", 45454554, "ADR2", 2420);
    System.out.println(car1);
    System.out.println(car2);

  }
}
