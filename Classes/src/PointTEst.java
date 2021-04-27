//link to Point

public class PointTEst
{
  public static void main(String[] args)
  {
    Point a = new Point(3,4);
    Point b = new Point(0,1);

    System.out.println("Point a: " + a.getX() + " " + a.getY());
    a.setX(2);
    a.setY(1);
    System.out.println(a);
    System.out.println(b);
    b.moveTo(2,1);
    System.out.println(b);

    //math.sqrt(number)

    int x1 = a.getX();
    int x2 = b.getX();

    int y1 = a.getY();
    int y2 = a.getX();

    //Math.pow (number, power);
    double dist = (double)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    System.out.println("dist: " + dist);
  }
}
