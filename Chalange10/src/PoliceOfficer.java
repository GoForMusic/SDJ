public class PoliceOfficer
{
  private String name;
  private String bageNumber;
  private ParkedCar[] parkedCars = new ParkedCar[2];

  public PoliceOfficer(String name, String bageNumber)
  {
    this.name = name;
    this.bageNumber = bageNumber;
    for(int index=0;index< parkedCars.length;index++)
    {
      parkedCars[index]=null;
    }
  }

  public void setParkedCars(ParkedCar car, int index)
  {
    this.parkedCars[index] = car.copy();
  }

  public ParkedCar[] getParkedCars()
  {
    return parkedCars;
  }

  public ParkedCar getParkedCar(int index)
  {
    return parkedCars[index].copy();
  }

  public String getName()
  {
    return name;
  }

  public String getBageNumber()
  {
    return bageNumber;
  }

  public boolean isParkingMeterExpired(int index)
  {
    if(parkedCars[index].copy().getNumberOfMinutes() > parkedCars[index].copy().getParkingMeterMin()) return true;
    return false;
  }

  public ParkingTicket calculateFine(int index)
  {
    if(isParkingMeterExpired(index)){
      ParkingTicket ticket = new ParkingTicket(25,this);
      return ticket;
    }else return null;
  }

  public String toString()
  {
    return "|OFFICER|" + ""
        +"\n Officer name: " + this.name + ""
        +"\n Officer bage number: " + this.bageNumber + "";
  }
}
