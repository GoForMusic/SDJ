package Test2;

public class CirclesTest
{
  public static void main(String[] args)
  {
    Circle circle1 = new Circle(4,4,55);
    Point point1= circle1.getCenter();
    circle1.moveCircle(0,150);
    Circle circle2 = new Circle(point1.getX(), point1.getY(), 55);
    CircleList circleList = new CircleList(3);
    circleList.addCircle(circle1);
    circleList.addCircle(circle2);

    System.out.println(circleList.getTotalArea() + " " + circleList.getAverageArea());

    for(int index=0;index<circleList.getNumberOfCircles();index++)
    {
      System.out.println(circleList.getCircle(index));
    }
  }
}
