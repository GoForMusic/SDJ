import java.util.Arrays;

public class Garage
{
  private Car[] cars = new Car[2];

  public Garage()
  {
    for (int index = 0; index < cars.length; index++)
    {
      cars[index] = null;
    }
  }

  public boolean isParkingAreaTaken(int position)
  {
    if (cars[position] != null)
          return true;
        else
          return false;
  }

  public void park(Car car, int position)
  {
    if(!isParkingAreaTaken(position)) this.cars[position] = car;
  }

  public Car leaveGarage(int position)
  {
    if (!isParkingAreaTaken(position))
      return null;
    else
    {
      Car carRef = cars[position];
      cars[position] = null;
      return carRef;
    }
  }

  public String toString()
  {
    String localString = "";

    for (int index = 0; index < cars.length; index++)
    {
      localString = localString + "\nPosition: " + index + "| Cars details: "
          + cars[index];
    }

    return localString;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Garage))
      return false;

    Garage garage = (Garage) obj;

    if(Arrays.equals(this.cars, garage.cars)) return true;
      else return false;
      /*if (this.cars[index].getMake().equals(localCar.getMake())
          && this.cars[index].getModel().equals(localCar.getModel())
          && this.cars[index].getColor().equals(localCar.getColor())
          && this.cars[index].getLicenseNumber().equals(localCar.getLicenseNumber())
          && this.cars[index].getYear() == localCar.getYear())
        localCase = true;
      else
        localCase = false;
    }*/
  }

}
