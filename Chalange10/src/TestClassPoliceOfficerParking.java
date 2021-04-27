public class TestClassPoliceOfficerParking
{
  public static void main(String[] args)
  {
    ParkingMeter meter = new ParkingMeter(60);
    ParkedCar car1 = new ParkedCar("Peugeot", "307", "blue", "BT 01 ADR", 120, meter);
    ParkedCar car2 = new ParkedCar("Ferarri", "laferarri", "red", "BT 01 ASD", 120, meter);

    PoliceOfficer officer1 = new PoliceOfficer("Parola", "BR00132ASFASF");

    officer1.setParkedCars(car1,0);
    officer1.setParkedCars(car2,1);

    for(int index=0;index<officer1.getParkedCars().length;index++)
    {
      if(officer1.isParkingMeterExpired(index)) {
        System.out.println(officer1);
        System.out.println(officer1.getParkedCar(index));
        System.out.println(officer1.calculateFine(index));
      }
    }



  }
}
