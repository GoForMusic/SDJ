//test class link with others

public class TestClass
{
  public static void main(String[] args)
  {
    //Person class
    Person person1 = new Person("Adrian",new MyDate(12,11,1998));
    Person person2 = new Person("Jhon",new MyDate(26,11,887));


    System.out.println(person1);
    System.out.println(person2);
    
    
    //MyDate class
    MyDate myDate1 = new MyDate(15,2,2021);
    MyDate myDate2 = new MyDate(11,4,2011);

    System.out.println(myDate1 + " " + myDate2);
  }
}
