public class LandTract
{
  private int length;
  private int width;

  public LandTract(int length, int width)
  {
    this.length =length;
    this.width = width;
  }

  public double getArea()
  {
    return (double)length*width;
  }

  public boolean equal(LandTract area)
  {
    if(this.length == area.length && this.width == area.width)
      return true;
    else return false;
  }

  public String toString()
  {
    return "Length:" + this.length + "| Width: " + this.width;
  }

}
