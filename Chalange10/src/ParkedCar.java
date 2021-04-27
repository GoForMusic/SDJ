public class ParkedCar
{
  private String make;
  private String model;
  private String color;
  private String licenseNumber;
  private int numberOfMinutes;
  private ParkingMeter parkingMeter;

  public ParkedCar(String make, String model, String color, String licenseNumber, int numberOfMinutes, ParkingMeter parkingMeter)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseNumber = licenseNumber;
    this.numberOfMinutes = numberOfMinutes;
    this.parkingMeter = parkingMeter;
  }

  public String getMake()
  {
    return make;
  }

  public String getModel()
  {
    return model;
  }

  public String getColor()
  {
    return color;
  }

  public String getLicenseNumber()
  {
    return licenseNumber;
  }

  public int getNumberOfMinutes()
  {
    return numberOfMinutes;
  }

  public int getParkingMeterMin()
  {
    return parkingMeter.getMinutes();
  }

  public String toString()
  {
    return "|CAR INFO|" + ""
        +"\n Car make: " + this.make + ""
        +"\n Car model: " + this.model + ""
        +"\n Car color: "+this.color + ""
        +"\n Car license number: "+this.licenseNumber+""
        +"\n Car numbers of minutes: "+this.numberOfMinutes+""
        +"\n Car parking meter: " + this.parkingMeter.getMinutes();
  }

  public ParkedCar copy()
  {
    return new ParkedCar(make,model,color, licenseNumber, numberOfMinutes, parkingMeter);
  }

}
