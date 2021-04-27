package Model;

import java.io.Serializable;

public class Owner implements Serializable
{
  private String firstName;
  private String lastName;

  public Owner(String firstName, String lastName)
  {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String toString()
  {
    return "Model.Owner{" + "firstName='" + firstName + '\'' + ", lastName='"
        + lastName + '\'' + '}';
  }

  public boolean equals(Object o)
  {
    if (!(o instanceof Owner))
      return false;

    Owner owner = (Owner) o;

    if(owner.firstName.equals(this.firstName)&& owner.lastName.equals(this.lastName)) return true;
    else return false;
  }
}
