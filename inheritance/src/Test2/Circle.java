package Test2;

public class Circle
{
  private double radius;
  private Point center;


  public Circle(double x, double y, double radius)
  {
    this.radius = radius;
    this.center=new Point(x,y);
  }

  public Point getCenter()
  {
    return center;
  }

  public double getRadius()
  {
    return radius;
  }

  public void moveCircle(double dx, double dy)
  {
    center = new Point(dx+center.getX(), dy+ center.getY());
  }

  public double getArea()
  {
    return Math.PI*Math.pow(radius,2);
  }

  public String toString()
  {
    return "Radius:"+radius+"\n"+"Center:"+center;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Circle)) return false;

    Circle circle = (Circle)obj;

    if(radius==circle.radius && center.equals(circle.center)) return true;
    else return false;

  }
}
