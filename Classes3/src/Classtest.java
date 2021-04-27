//link to Car class

public class Classtest
{
  public static void main(String[] args)
  {
    //ex1();

    //ex2();

    ex3();

  }

  private static void ex3()
  {
    MyNumber n1 = new MyNumber(28);
    MyNumber n2 = new MyNumber(31);
    System.out.println(n1.getNumber());
    System.out.println(n1.getLastDigit());
    System.out.println(n1.getFirstDigit());
    System.out.println(n1.isDivisibleBy(7));
    System.out.println(n1.numberOfProperDivisiors());
    System.out.println(n1.isPrime());
    System.out.println(n2.isPrime());
    System.out.println(n1);
    System.out.println(n2);
    MyNumber n3 = n1.plus(n2);
    System.out.println(n3);
    MyNumber n4 = n1.plus(null);
    System.out.println(n4);
    System.out.println(n1.isPerfectNumber());
  }

  private static void ex2()
  {
    Sample sample1 = new Sample();
    sample1.display();



  }

  private static void ex1()
  {
    Car car1 = new Car("Peugeot", "307","blue",2012);
    Car car2 = new Car("Peugeot", "307","blue","BR 11 ARD",2012);
    Car car3 = car2.copy();

    System.out.println(car1.equals(car2));
    car1.setLicenseNumber("BR 11 ARD");
    System.out.println(car1.equals(car2));
    System.out.println(car1);
  }
}
