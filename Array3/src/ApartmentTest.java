public class ApartmentTest
{
  public static void main(String[] args)
  {
    Apartment apartment = new Apartment("GHorsens", 200);
    apartment.rentTo("Adrian","0000000");
    apartment.chargeRent();
    apartment.collectRent(100);
    apartment.evict();

    System.out.println(apartment);

  }
}
