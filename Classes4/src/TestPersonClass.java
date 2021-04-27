public class TestPersonClass
{
  public static void main(String[] args)
  {
    MyDate date = new MyDate(22,12,1998);
    Address address = new Address("Industiei", "9", "801115", "Braila", "Romania");
    Person person = new Person("Adrian",address ,date);

    System.out.println(person);
    System.out.println(person.getAge());

  }
}
