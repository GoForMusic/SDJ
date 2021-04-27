package Ex2;

public class ANimalTest
{
  public static void main(String[] args)
  {
    Animal[] animals = new Animal[4];
    animals[0]=new Frog();
    animals[1]=new Bee();
    animals[2]=new Dog();
    animals[3]=new Cat();

    for(Animal index:animals)
    {
      System.out.println(index.speak());
    }

  }
}
