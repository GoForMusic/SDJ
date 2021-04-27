import com.sun.jdi.request.ClassUnloadRequest;

public class Address
{
  private String street;
  private String number;
  private String postalCode;
  private String city;
  private String country;

  public Address(String street, String number, String postalCode, String city,
      String country)
  {
    this.street = street;
    this.number = number;
    this.postalCode = postalCode;
    this.city = city;
    this.country = country;
  }

  public void setAddress(String street, String number, String postalCode,
      String city, String country)
  {
    this.street = street;
    this.number = number;
    this.postalCode = postalCode;
    this.city = city;
    this.country = country;
  }

  public String getStreet()
  {
    return street;
  }

  public void setStreet(String street)
  {
    this.street = street;
  }

  public String getNumber()
  {
    return number;
  }

  public void setNumber(String number)
  {
    this.number = number;
  }

  public String getPostalCode()
  {
    return postalCode;
  }

  public void setPostalCode(String postalCode)
  {
    this.postalCode = postalCode;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  public String getCountry()
  {
    return country;
  }

  public void setCountry(String country)
  {
    this.country = country;
  }

  public String toString()
  {
    return "Street: " + this.street + ", number: " + this.number
        + ", postal code: " + this.postalCode + ", city: " + this.city
        + ", country: " + this.country;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Address))
    {
      return false;
    }

    Address address = (Address) obj;

    if (this.street.equals(address.street) && this.number.equals(address.number)
        && this.postalCode.equals(address.postalCode) && this.city
        .equals(address.city) && this.country.equals(address.country))
      return true;
    else
      return false;

  }
}

