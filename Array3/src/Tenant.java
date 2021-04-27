public class Tenant
{
  private String name;
  private String phone;
  private double rentDue;

  public Tenant(String name, String phone)
  {
    this.name = name;
    this.phone = phone;
    this.rentDue = 0;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setPhone(String phone)
  {
    this.phone = phone;
  }

  public void setRentDue(double rentDue)
  {
    this.rentDue = rentDue;
  }

  public String getName()
  {
    return name;
  }

  public double getRentDue()
  {
    return rentDue;
  }

  public String getPhone()
  {
    return phone;
  }

  public Tenant copy()
  {
    return new Tenant(this.name,this.phone);
  }

  public String toString()
  {
    return "Name: " + this.name + " | Phone: " + this.phone + " | Rent due: "+ this.rentDue;
  }

}
