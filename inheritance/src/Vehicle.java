public class Vehicle
{
  private String owner;
  private double price;


  public Vehicle(String owner, double price)
  {
    this.owner = owner;
    this.price = price;
  }

  public String getOwner()
  {
    return owner;
  }

  public double getPrice()
  {
    return price;
  }

  public void setOwner(String owner)
  {
    this.owner = owner;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public String toString()
  {
    return "Owner: " + this.owner + "| Price: " + this.price;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Vehicle)) return false;

    Vehicle vehicle = (Vehicle)obj;

    if(owner.equals(vehicle.owner) && price == vehicle.price) return true;
    else  return false;
  }
}
