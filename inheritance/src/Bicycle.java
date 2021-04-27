public class Bicycle extends Vehicle
{
  private int gears;

  public Bicycle(String owner, double price, int gears)
  {
    super(owner, price);
    this.gears = gears;
  }

  public int getGears()
  {
    return gears;
  }

  public void setGears(int gears)
  {
    this.gears = gears;
  }

  public String toString()
  {
    return super.toString()+"| gears: " + this.gears;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Bicycle))return false;

    Bicycle bicycle = (Bicycle)obj;

    if(gears==bicycle.gears && super.equals(bicycle)) return true;
    else return false;
  }

}
