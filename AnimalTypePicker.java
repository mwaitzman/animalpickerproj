import java.util.Scanner;
public class AnimalTypePicker {
  static Scanner UserInputScanner = new Scanner(System.in);
  public static void main(String[] args) {
    BASE_Animals Animals = new BASE_Animals();
    System.out.println("choose an animal from the following list (type the number to the right of the animal you would like to select):");
    for (int i=0; i<Animals.TypesOfAnimals.length; i++) {
      System.out.println("#" + (i+1) + ": " + Animals.TypesOfAnimals[i]);
      //------------
    }
    boolean hasSelected = false;
    String ChosenAnimal = null;//is null a reserved keyword?? should check sometime
    do {
      ChosenAnimal = UserInputScanner.nextLine();
      try {
        int ChosenAnimalByNumber = Integer.parseInt(ChosenAnimal);
        boolean AnimalWasChosenByItsNumber = true;
      }
      catch (NumberFormatException ChosenAnimal_NFE) {
        boolean AnimalWasChosenByItsNumber = false;
      }
      try {
        if (AnimalWasChosenByItsNumber == false) {
          for(int i=0; i<Animals.TypesOfAnimals.length; i++) {
            if (ChosenAnimal.equalsIgnoreCase(Animals.TypesOfAnimals[i])) {
              ChosenAnimal = Animals.TypesOfAnimals[i];
              hasSelected = true;
              break;/////////////////////////////////////////////////
            }
          }
        }
      }
      catch (Exception EXCEPTION_AnimalIdentificationLoop) {
        System.out.println("Unfortunately, an error of type \"" + EXCEPTION_AnimalIdentificationLoop + "\" has occurred in the \"AnimalIdentificationLoop\".");
      }
    } while (hasSelected == false); //part of a do-while loop
    System.out.println("You selected a(n) " + ChosenAnimal + ". Is this correct? (y/n)");
    String UserInput = UserInputScanner.nextLine();
  }
}
class BASE_Animals {
  public String[] TypesOfAnimals = {"lion","tiger","wolf","rabbit","bear","turtle"};
}
