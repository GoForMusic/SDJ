//Link to Job class

public class JobTest
{
  public static void main(String[] args)
  {
    Person person = new Person("Adrian", new MyDate(26, 12, 1998));
    Job job1 = new Job("Manager", 2000, person);
    Job job2 = new Job("Teacher", 5000);

    job2.setEmployee(new Person("Mihai", new MyDate(55,55,48885)));
    job2.setSalary(200);
    job2.setTitle("Manager");
    job2.getPercentageRaise(20);

    System.out.println(job1);
    System.out.println(job2);

  }
}
