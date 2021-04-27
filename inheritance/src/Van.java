public class Van extends Car
{
  private int maxLoad;

  public Van(String owner, double price, String regNo, int maxLoad)
  {
    super(owner, price, regNo);
    this.maxLoad=maxLoad;
  }

  public int getMaxLoad()
  {
    return maxLoad;
  }

  public String toString()
  {
    return super.toString() + " | max load: "+this.maxLoad;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Van))return false;

    Van van = (Van)obj;

    if(maxLoad==van.maxLoad && super.equals(van)) return true;
    else return false;
  }
}
