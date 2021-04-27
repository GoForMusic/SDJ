public class Person
{
  private String name;
  private Address address;
  private MyDate birthday;
  private Brain brain;

  public Person(String name, Address address, MyDate birthday, Brain brain)
  {
    this.name = name;
    this.address = address;
    this.birthday = birthday.copy();
    this.brain = brain.copy();
  }

  public Person(String name, Address address, MyDate birthday)
  {
    this.name = name;
    this.address = address;
    this.birthday = birthday.copy();
    this.brain = null;
  }

  public Person(String name, MyDate birthday)
  {
    this.name = name;
    this.birthday = birthday.copy();
    this.address = null;
    this.brain =null;
  }

  public Person(MyDate birthday)
  {
    this.name = null;
    this.address = null;
    this.birthday = birthday.copy();
    this.brain = null;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public Address getAddress()
  {
    return address;
  }

  public String getShortAddress()
  {
    return "street: " + this.address.getStreet() + ", number: " + this.address.getNumber();
  }

  public void setAddress(Address address)
  {
    this.address = address;
  }

  public MyDate getBirthday()
  {
    return birthday.copy();
  }

  public int getAge()
  {
    MyDate currentDate = MyDate.today();

    int age = currentDate.getYear() - birthday.getYear();

    if(currentDate.getMonth() < birthday.getMonth()) age--;
      else if (currentDate.getMonth() == birthday.getMonth() && currentDate.getDay() < birthday.getDay()) age--;
    return age;
  }

  public int getIQ()
  {
    int getIQ = brain.getIQ();

    return getIQ;
  }

  public boolean isBrainDamaged()
  {
    if(this.brain.isBrainDamaged()) return true;
      else return false;
  }

  public boolean doYouRemember(String topic)
  {
    if(this.brain.recall(topic)) return true;
    else return false;
  }

  public void rememberThis(String topic)
  {
    if(this.brain.recall(topic)) this.brain.refreshMemory(topic);
      else this.brain.remember(topic);
  }

  public String whatAreYouThinkingAbout()
  {
    return this.brain.recall();
  }

  public String toString()
  {
    return "Person info: \n" + "Name: " + this.name + "\n| Adress:\n" + this.address
        + "\n| Birthday: \n" + getBirthday();
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Person))
      return false;

    Person person = (Person) obj;

    if (this.name.equals(person.name) && this.address.equals(person.address)
        && this.birthday == person.birthday)
      return true;
    else
      return false;

  }
}
