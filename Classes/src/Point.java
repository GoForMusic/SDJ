//Exercise 5.03
// Create a class Point representing a point (x,y) of integers in a coordinate system.
// The class should have:
// a)Two instance variables x and y both of type int.
// b)A constructor with two arguments setting both x and y.
// c)Get and set methods for both instance variables.
// d)A method moveTo(int newX, int newY) that sets the point (x,y) to a new position represented by (newX, newY).
// e)A method move(int xDistance, int yDistance) that sets the point (x,y) to the position (x + xDistance, y + yDistance).
// f)A method toString() that returns a string with the point in the format "(x,y)".
// An example: calling the toString-method on a point with x=3 and y=4 should return the string "(3, 4)".
// Now create a test class (PointTest) with a main method to test the Point class
// g)Create two Point objects.
// h)Test the methods in the Point class.
// i)Print out the two points using the toString-method.
// j)Calculate and print out the distance between the two points.
// The distance between two points (x1, y1) and (x2, y2) in a coordinate system is given by the following:dist = 212212)()(yyxx−+− Hint:
// in Java the square root of a number is foundby: Math.sqrt(number).

public class Point
{
  private int x;
  private int y;

  Point(int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  public void setX(int x)
  {
    this.x = x;
  }

  public void setY(int y)
  {
    this.y = y;
  }

  public int getX()
  {
    return x;
  }

  public int getY()
  {
    return y;
  }

  public void moveTo(int newX, int newY)
  {
    this.x = newX;
    this.y = newY;
  }

  public void move(int xDistance, int yDistance)
  {
    this.x = this.x + xDistance;
    this.y = this.y + yDistance;
  }

  public String toString()
  {
    return "("+this.x+","+this.y+")";
  }

}
