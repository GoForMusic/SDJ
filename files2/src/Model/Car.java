package Model;

import java.io.Serializable;

public class Car implements Serializable
{
  private String regNumber;
  private String make;
  private String model;
  private int year;
  private Owner owner;

  public Car(String regNumber, String make, String model, int year, Owner owner){
    this.regNumber=regNumber;
    this.make=make;
    this.model=model;
    this.year=year;
    this.owner=owner;
  }

  public int getYear()
  {
    return year;
  }

  public String getModel()
  {
    return model;
  }

  public String getMake()
  {
    return make;
  }

  public Owner getOwner()
  {
    return owner;
  }

  public String getRegNumber()
  {
    return regNumber;
  }

  public String toString()
  {
    return "Model.Car{" + "regNumber='" + regNumber + '\'' + ", make='" + make + '\''
        + ", model='" + model + '\'' + ", year=" + year + ", owner=" + owner
        + '}';
  }

  public boolean equals(Object o)
  {
    if (!(o instanceof Car))
      return false;
    Car car = (Car) o;
    if(car.getYear()==this.year&&car.getModel().equals(this.model)&&car.getMake().equals(this.make)&&car.getRegNumber().equals(this.regNumber)&&car.getOwner().equals(this.owner)) return true;
    else return false;
  }
}
