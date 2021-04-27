//Exercise 7.01
// Write a program that asks a user to enter a number within the range 1-10.
// The program should then display the Roman numeral version of the entered number.
// If the number is outside the range 1-10, the program should display an error message of your choice.
// The first ten Roman numerals are {I, II, III, IV, V, VI, VII, VIII, IX, X}.

import java.util.Scanner;

public class Decission7
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter a number 1-10:");
    int number = keyboard.nextInt();

    if(number<1||number>10)
    {
      System.out.println("The number must be betwwen 1-10!!");
    }else{
      System.out.println(romanNumbers(number));
    }
  }

  private static String romanNumbers(int number)
  {
    String romanNumber = null;
    if(number == 1){
      romanNumber = "I";
    }else if(number == 2){
      romanNumber = "II";
    }else if(number == 3){
      romanNumber = "III";
    }else if(number == 4){
      romanNumber = "IV";
    }else if(number == 5){
      romanNumber = "V";
    }else if(number == 6){
      romanNumber = "VI";
    }else if(number == 7){
      romanNumber = "VII";
    }else if(number == 8){
      romanNumber = "VIII";
    }else if(number == 9){
      romanNumber = "IX";
    }else if(number == 10){
      romanNumber = "X";
    }
    return romanNumber;
  }


}
