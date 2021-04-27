import java.lang.reflect.AnnotatedParameterizedType;

public class Apartment
{
  private String address;
  private double rent;
  private Tenant tenant;

  public Apartment(String address, double rent)
  {
    this.address = address;
    this.rent = rent;
    this.tenant = null;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public double getRent()
  {
    return rent;
  }

  public void rentTo(String name, String phone)
  {
    if (!isOccupied())
      this.tenant = new Tenant(name, phone);
  }

  public void evict()
  {
    if (isOccupied())
      this.tenant = null;
  }

  public boolean isOccupied()
  {
    if (this.tenant == null)
      return false;
    else
      return true;
  }

  public Tenant getTenant()
  {
    if (isOccupied())
      return this.tenant.copy();
    else
      return null;
  }

  public double getRentDue()
  {
    if (isOccupied())
      return this.tenant.getRentDue();
    else
      return 0;
  }

  public void chargeRent()
  {
    if (isOccupied())
      this.tenant.setRentDue(this.rent);
  }

  public void collectRent(double amounth)
  {
    if (isOccupied())
    {
      this.tenant.setRentDue(this.tenant.getRentDue() - amounth);
    }
  }

  public String toString()
  {
    String localString = "";

    localString +=
        "Adress: " + this.address + "\n" + "Rent: " + this.rent + "\n";
    if (isOccupied())
      localString += this.tenant;
    else
      localString += "No tenant";

    return localString;
  }
}
