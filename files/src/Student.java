import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable
{
  private String firstName;
  private String lastName;
  private String country;

  public Student(String firstName, String lastName, String country)
  {
    this.country=country;
    this.firstName=firstName;
    this.lastName=lastName;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public String getCountry()
  {
    return country;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public void setCountry(String country)
  {
    this.country = country;
  }

  @Override public String toString()
  {
    return "Student{" + "firstName='" + firstName + '\'' + ", lastName='"
        + lastName + '\'' + ", country='" + country + '\'' + '}';
  }

  public boolean equals(Object o)
  {

    if (!(o instanceof Student))
      return false;
    Student student = (Student) o;
    return Objects.equals(firstName, student.firstName) && Objects
        .equals(lastName, student.lastName) && Objects
        .equals(country, student.country);
  }

}

