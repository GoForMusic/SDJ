import java.text.DecimalFormat;

public class Area
{
  private double Area;

  public Area(double radius)
  {
    this.Area = Math.PI*(radius*radius);
  }

  public Area(int width, int length)
  {
    this.Area = width*length;
  }

  public Area(double radius, double height)
  {
    this.Area = Math.PI*(radius*radius)*height;
  }

  public String toString()
  {
    DecimalFormat format = new DecimalFormat("0.00");
    return "Area: " + format.format(this.Area);
  }

}
