public class GarageTestClass
{
  public static void main(String[] args)
  {
    Garage garage1 = new Garage();
    Car car1 = new Car("Peugeot","309","blue", "BR 111 ADR", 2012);
    Car car2 = new Car("Peugeot","309","blue", "BR 111 ADR", 2012);
    Car car3 = new Car("Peugeot","309","blue", "BR 111 ADR", 2013);

    Garage garage2 = new Garage();

    garage1.park(car1,1);

    garage2.park(car1,0);
    garage2.park(car2,1);

    System.out.println(garage1.equals(garage2));
    System.out.println(garage1);
  }
}
