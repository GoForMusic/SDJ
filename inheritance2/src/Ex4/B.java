package Ex4;

public abstract class B
{
  protected int m;
  private int n;

  public int getM()
  {
    return m;
  }

  public int getN()
  {
    return n;
  }

  public void setM(int m)
  {
    this.m = m;
  }

  public void setN(int n)
  {
    this.n = n;
  }

  public abstract double calc();
}
