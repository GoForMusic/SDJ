import Model.Car;
import Model.CarList;
import Model.Owner;

public class testCarModelManager
{
  public static void main(String[] args)
  {
      CarModelManager carModelManager = new CarModelManager("carList.bin");
      //init(carModelManager);
      CarList carList = carModelManager.getAllCars();
      System.out.println(carList);
      Car car1=new Car("AL19742", "Ferrari","F50",1997,new Owner("Allan", "Henriksen"));
      carModelManager.deleteCar(car1);
      CarList carList2=carModelManager.getAllCars();
      System.out.println(carList2);
  }

  public static void init(CarModelManager carModelManager)
  {
    CarList carList = new CarList();
    Owner owner1 = new Owner("Allan", "Henriksen");
    Owner owner2 = new Owner("Charlie", "Pace");
    Owner owner3 = new Owner("Claire", "Littleton");
    Owner owner4 = new Owner("Jack", "Shephard");
    Owner owner5 = new Owner("James", "Ford");
    Owner owner6 = new Owner("John", "Locke");
    Owner owner7 = new Owner("Juliet", "Burke");
    Owner owner8 = new Owner("Kate", "Austen");

    carList.addCar(new Car("AL19742", "Ferrari","F50",1997,owner1));
    carList.addCar(new Car("HE23477", "Audi","A7",2014,owner1));
    carList.addCar(new Car("XY54679", "Toyota","Yaris",2007,owner2));
    carList.addCar(new Car("JA72921", "Seat","Mii",2012,owner3));
    carList.addCar(new Car("RT90456", "Mercedes","W212",2010,owner4));
    carList.addCar(new Car("TY86934", "Dodge","Viper",2010,owner5));
    carList.addCar(new Car("OS38067", "Volkswagen","Golf",2012,owner6));
    carList.addCar(new Car("MD21739", "Volvo","S80",2009,owner7));
    carList.addCar(new Car("JK42234", "Ford","Focus",2008,owner8));

    System.out.println(carList);
    carModelManager.addCars(carList);

  }

}
