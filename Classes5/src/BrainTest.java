

public class BrainTest
{
  public static void main(String[] args)
  {
    MyDate date = new MyDate(26,12,1998);
    Brain brain = new Brain();
    Address address = new Address("Industiei", "9", "801115", "Braila", "Romania");
    Person person = new Person("Adrian",address, date, brain);


    System.out.println(person);

    person.rememberThis("How to manage to do x and y in math");
    person.rememberThis("TEsting something with brain IQ");
    person.rememberThis("TEsting something with brain IQ1111111111111111111111111111");


    System.out.println(person.getIQ());
    person.rememberThis("TestFinal");
    System.out.println(person.whatAreYouThinkingAbout());

  }
}
