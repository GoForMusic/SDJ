//first construct missing y parameter because the x will be 0 by default

public class TwoValues
{
  private int x, y;
  public TwoValues(int y)
  {
    this.y = y;
    x = 0;
  }
  public TwoValues()
  {
    x = 0;
    y = 0;
  }
}