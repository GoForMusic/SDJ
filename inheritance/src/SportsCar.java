public class SportsCar extends Car
{
  private int maxVelocity;

  public SportsCar(String owner, double price, String regNo, int maxVelocity)
  {
    super(owner, price, regNo);
    this.maxVelocity = maxVelocity;
  }

  public int getMaxVelocity()
  {
    return maxVelocity;
  }

  public String toString()
  {
    return super.toString() + " | maxVelocity: " + this.maxVelocity;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof SportsCar))return false;

    SportsCar sportsCar = (SportsCar)obj;

    if(maxVelocity==sportsCar.maxVelocity && super.equals(sportsCar)) return true;
    else return false;
  }

}
