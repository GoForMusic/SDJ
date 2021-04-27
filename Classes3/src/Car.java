public class Car
{
  private String make;
  private String model;
  private String color;
  private String licenseNumber;
  private int year;

  public Car(String make, String model, String color, String licenseNumber, int year)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseNumber = licenseNumber;
    this.year = year;
  }

  public Car(String make, String model, String color, int year)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseNumber = "";
    this.year = year;
  }

  public String getMake()
  {
    return make;
  }

  public int getYear()
  {
    return year;
  }

  public String getColor()
  {
    return color;
  }

  public String getLicenseNumber()
  {
    return licenseNumber;
  }

  public String getModel()
  {
    return model;
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  public void setLicenseNumber(String licenseNumber)
  {
    this.licenseNumber = licenseNumber;
  }

  public Car copy()
  {
    return new Car(this.make, this.model, this.color, this.licenseNumber, this.year);
  }

  public String toString()
  {
    String localInfo = "Car info \n" + "Car make:" + this.make + "| Car model:" + this.model + "| Car color:"+this.color+"| Car license number:"+this.licenseNumber+"| Car year:"+this.year;

    return localInfo;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Car))
    {
      return false;
    }

    Car car = (Car)obj;

    if(this.make.equals(car.make) && this.model.equals(car.model) && this.color.equals(car.color) && this.licenseNumber.equals(car.licenseNumber) && this.year == car.year)
      return true;
    else return false;
  }

}
