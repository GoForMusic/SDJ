//Exercise 2.06[Gaddis] Programming Challenge 17, p. 148
//17. Word Game
//Write a program that plays a word game with the user. The program should ask the user
//to enter the following:
// His or her name
// His or her age
// The name of a city
// The name of a college
// A profession
// A type of animal
// A pet's name
//After the user has entered these items, the program should display the following story,
//inserting the user’s input into the appropriate locations:
//There once was a person named NAME who lived in CITY. At the age of AGE,
//NAME went to college at COLLEGE. NAME graduated and went to work as a
//PROFESSION. Then, NAME adopted a(n) ANIMAL named PETNAME. They both lived
//happily ever after!

import java.util.Scanner;

public class WorldGame
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Your name: ");
    String userName = keyboard.nextLine();
    System.out.print("Your age: ");
    String userAge = keyboard.nextLine();
    System.out.print("Your city: ");
    String userCity = keyboard.nextLine();
    System.out.print("Your college: ");
    String userCollege = keyboard.nextLine();
    System.out.print("Your profession: ");
    String userProfession = keyboard.nextLine();
    System.out.print("Your favority type of animal: ");
    String userAnimalType = keyboard.nextLine();
    System.out.print("Your pet's name: ");
    String userPetName = keyboard.nextLine();

    System.out.println("There once was a person named " +userName+ " who lived in "+userCity+". At the age of "+userAge+",\n"
        +userName+" went to college at "+userCollege+". "+userName+" graduated and went to work as a\n"
        + userProfession+". Then, "+userName+" adopted a(n) "+userAnimalType+" named "+userPetName+". They both lived\n"
        + "happily ever after!");


  }
}
