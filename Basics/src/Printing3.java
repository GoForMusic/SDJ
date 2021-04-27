//Exercise 1.10 What will the following program print? Try to figure it out yourself before
//running the program.

public class Printing3
{
  public static void main(String[] args)
  {
    System.out.println(23 * 4.5 / 0.5 + 1); // 208.0
    System.out.println(23 * 4.5 / (0.5 + 1)); // 69.0
    System.out.println(2 + 5 - 18 + 11); // 0
    System.out.println((2 + 5) - (18 + 11)); // -22
    System.out.println(14 * 18 / 4 + 4); // 67
    System.out.println(14 * 18 / (4 + 4)); // 31
  }
}
