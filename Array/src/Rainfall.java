public class Rainfall
{
  private double[] rainfall = new double[12];

  public void setRainfall(double rainfall, int index)
  {
    this.rainfall[index] = rainfall;
  }

  public double getTotalRainfall()
  {
    double total=0;

    for(int index=0;index<rainfall.length;index++)
    {
      total = total + rainfall[index];
    }
    return total;
  }

  public double getAverageRainfall()
  {
    double avarage=getTotalRainfall()/rainfall.length;

    return avarage;
  }

  public int getLeastRain()
  {
    int min = Integer.MAX_VALUE;;

    for(int index=0;index<rainfall.length;index++)
    {
      if(min > rainfall[index]) min = index;
    }
    return min;
  }

  public int getMostRain()
  {
    int max = Integer.MIN_VALUE;;

    for(int index=0;index<rainfall.length;index++)
    {
      if(max < rainfall[index]) max = index;
    }
    return max;
  }

}
