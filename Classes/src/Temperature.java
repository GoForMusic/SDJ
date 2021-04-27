//4. Temperature Class
//Write a Temperature class that will hold a temperature in Fahrenheit and provide methods
//
//to get the temperature in Fahrenheit, Celsius, and Kelvin. The class should have the follow-
//ing field:
//
//● ftemp—A double that holds a Fahrenheit temperature.
//The class should have the following methods:
//● Constructor—The constructor accepts a Fahrenheit temperature (as a double) and
//stores it in the ftemp field.
//● setFahrenheit—The setFahrenheit method accepts a Fahrenheit temperature (as a
//double) and stores it in the ftemp field.
//● getFahrenheit—Returns the value of the ftemp field, as a Fahrenheit temperature (no
//conversion required).
//● getCelsius—Returns the value of the ftemp field converted to Celsius.
//● getKelvin—Returns the value of the ftemp field converted to Kelvin.

public class Temperature
{
  private double ftemp;

  public Temperature(double ftemp)
  {
    this.ftemp = ftemp;
  }

  public void setFahrenheit(double ftemp)
  {
    this.ftemp = ftemp;
  }

  public double getFahrenheit()
  {
    return ftemp;
  }

  public double getCelsius()
  {
    return (5/9) * (ftemp - 32);
  }

  public double getKelvin()
  {
    return ((5/9) * (ftemp - 32))+273;
  }


}
