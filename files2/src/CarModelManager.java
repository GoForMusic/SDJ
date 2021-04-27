import Model.Car;
import Model.CarList;
import Utils.MyFileHandler;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CarModelManager
{
  private String fileName;

  public CarModelManager(String fileName)
  {
    this.fileName=fileName;
  }

  public CarList getAllCars()
  {
    CarList carList = new CarList();

    try
    {
      carList = (CarList) MyFileHandler.readFromBinaryFile(fileName);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class Not Found");
    }
    return carList;
  }

  public void addCar(Car car)
  {
      CarList carList = getAllCars();
      carList.addCar(car);
      addCars(carList);
  }
  public void addCars(CarList cars)
  {
    try
    {
      MyFileHandler.writeToBinaryFile(fileName,cars);
    }catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO Error reading file");
    }
  }

  public void deleteCar(Car car)
  {
    CarList carList = getAllCars();
    CarList carList1 = new CarList();
    for(int index=0;index<carList.size();index++)
    {
      System.out.println(carList.getCar(index).equals(car));
      if(!carList.getCar(index).equals(car)) carList1.addCar(carList.getCar(index));
    }

    addCars(carList1);

  }

  public void deleteCarByRegNumber(String regNumber)
  {
    CarList carList = getAllCars();
    CarList carList1 = new CarList();
    for(int index=0;index<carList.size();index++)
    {
      if(!carList.getCar(index).getRegNumber().equals(regNumber)) carList1.addCar(carList.getCar(index));
    }

    addCars(carList1);
  }

}
