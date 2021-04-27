package Test2;

public class CircleList
{
  private int capacity;
  private Circle[] circles;

  public CircleList(int capacity)
  {
    this.capacity = capacity;
    this.circles = new Circle[capacity];
  }

  public int getNumberOfCircles()
  {
    return circles.length;
  }

  public void addCircle(Circle circle)
  {
    boolean set=false;
    for (int index = 0; index < circles.length; index++)
    {
      if(circles[index]==null && set==false) {
        circles[index] = circle;
        set=true;
      }
    }
  }

  public Circle getCircle(int index)
  {
    return circles[index];
  }

  public double getTotalArea()
  {
    double totalArea = 0.0;

    for (int index = 0; index < circles.length; index++)
    {
      if(circles[index]!=null)
      totalArea += circles[index].getArea();
    }
  return totalArea;
  }

  public double getAverageArea()
  {
    return getTotalArea()/circles.length;
  }

}
