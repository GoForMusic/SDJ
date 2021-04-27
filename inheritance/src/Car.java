public class Car extends Vehicle
{
  private String regNo;

  public Car(String owner, double price, String regNo)
  {
    super(owner, price);
    this.regNo = regNo;
  }

  public String getRegistrationNumber()
  {
    return regNo;
  }

  public void setRegistrationNumber(String regNo)
  {
    this.regNo = regNo;
  }

  public String toString()
  {
    return super.toString() + "| RegNo: " + regNo;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Car))return false;

    Car car = (Car)obj;

    if(regNo.equals(car.regNo) && super.equals(car)) return true;
    else return false;
  }

}
