package Ex1;

public class Circle extends TwoDimensionalShape
{
  private double radius;

  public Circle(double x, double y, double radius)
  {
    super(x, y);
    this.radius=radius;
  }

  public double getRadius()
  {
    return radius;
  }

  public void setRadius(double radius)
  {
    this.radius = radius;
  }

  public double getArea()
  {
    return Math.pow(radius,2)*Math.PI;
  }
}
