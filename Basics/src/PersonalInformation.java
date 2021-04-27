//Exercise 1.03 [Gaddis] Programming Challenge 3, p. 145

public class PersonalInformation
{
  public static void main(String[] args){
    String name="Adrian Militaru";
    String[] address = {"NW streets no:5", "NW City", "NW", "88888"};
    String telephoneNumber= "+4400000000000";
    String collegeMajor= "VIA";


    System.out.print("\n"+name);
    for(int index = 0; index < address.length; index ++){
      System.out.print("\n"+address[index]);
    }

    System.out.print("\n"+telephoneNumber);
    System.out.print("\n"+collegeMajor);

  }
}
