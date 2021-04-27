//Exercise 3.03
// The Payroll class
// a)Design and implement a Payroll class that has fields for an employee’s name, hourly pay rate, and number of hours worked.
// b)Write the appropriate accessor and mutator methods to get and set the fields.
// c)The class should also have a method that returns the employee’s gross pay (hourly pay rate multiplied with the number of hours worked).
// d)Write a PayrollTest class that demonstrates class Payroll's capabilities.
// Use the Scanner class to let a user enter the employee’s information on their keyboards.

public class Payroll
{
  private String employeeName;
  private double horlyPayRate;
  private int numberHours;

  public Payroll(String employeeName, double horlyPayRate, int numberHours)
  {
    this.employeeName = employeeName;
    this.horlyPayRate = horlyPayRate;
    this.numberHours = numberHours;
  }

  public Payroll()
  {
    this.employeeName = null;
    this.horlyPayRate = 0;
    this.numberHours = 0;
  }

  public void setEmployeeName(String employeeName)
  {
    this.employeeName = employeeName;
  }

  public void setHorlyPayRate(double horlyPayRate)
  {
    this.horlyPayRate = horlyPayRate;
  }

  public void setNumberHours(int numberHours)
  {
    this.numberHours = numberHours;
  }

  public double getHorlyPayRate()
  {
    return horlyPayRate;
  }

  public int getNumberHours()
  {
    return numberHours;
  }

  public String getEmployeeName()
  {
    return employeeName;
  }

  public double getEmployeeGrossPay()
  {
    return numberHours * horlyPayRate;
  }

  public String toString()
  {
    return "The employee "+employeeName+" have the gross pay "+getEmployeeGrossPay();
  }

}
