package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class CarList implements Serializable
{
  private ArrayList<Car> cars;

  public CarList(){
    cars = new ArrayList<Car>();
  }

  public int size()
  {
    return cars.size();
  }

  public int indexOfRegNumber(String regNumber)
  {
    int localIndex=-1;
    for (int index = 0; index < cars.size(); index++)
    {
      if (cars.get(index).getRegNumber().equals(regNumber)){
        localIndex=index;
        break;
      }
    }
    return localIndex;
  }

  public Car getCar(int index)
  {
    return cars.get(index);
  }

  public Car getCar(String regNumber)
  {
    Car localCar = null;
    for (int index = 0; index < cars.size(); index++)
    {
      if (cars.get(index).getRegNumber().equals(regNumber)){
        localCar=cars.get(index);
        break;
      }
    }
    return localCar;
  }

  public void addCar(Car object)
  {
    if(indexOfRegNumber(object.getRegNumber())==-1) cars.add(object);
  }

  public String toString()
  {
    String localString = "";

    for(Car car:cars)
    {
      localString+=car + "\n";
    }

    return localString;
  }
}
