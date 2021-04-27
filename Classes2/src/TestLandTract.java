public class TestLandTract
{
  public static void main(String[] args)
  {
    LandTract land1 = new LandTract(2, 2);
    LandTract land2 = new LandTract(2, 2);

    System.out.println("Area: " + land1.getArea());
    System.out.println("Area: " + land2.getArea());

    System.out.println("Are equal? " + land1.equal(land2));

    System.out.println(land1);
    System.out.println(land2);

  }
}
