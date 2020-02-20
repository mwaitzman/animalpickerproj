import java.util.Scanner;
public class AnimalTypePicker {
  public static void main(String[] args) {
    BASE_Animals Animals = new BASE_Animals();
    Scanner UserInputScanner = new Scanner(System.in);
    boolean hasSelected = false;
    String ChosenAnimal = null;
    Boolean AnimalWasChosenByItsNumber = null;
    String UserInput;
    int ChosenAnimalByNumber;
    System.out.println("choose an animal from the following list (type the number to the right of the animal you would like to select OR type the the name of the animal you would like to select (case doesn't matter)):");
    System.out.println("--------------------");
    for (int i=0; i<Animals.TypesOfAnimals.length; i++) {
      System.out.println("#" + (i+1) + ": " + Animals.TypesOfAnimals[i]);
    }
    System.out.println("--------------------");
    do {
      UserInput = UserInputScanner.nextLine();
      try {
        ChosenAnimalByNumber = Integer.parseInt(UserInput);
        if (ChosenAnimalByNumber < 0) {
          System.out.println("The negative number you entered has been automatically converted to its positive counterpart.");
        }
        AnimalWasChosenByItsNumber = true;
        ChosenAnimal = Animals.TypesOfAnimals[Math.abs(ChosenAnimalByNumber)-1];
        hasSelected = true;
      }
      catch (NumberFormatException ChosenAnimal_NFE) {
        AnimalWasChosenByItsNumber = false;
        for(int i=0; i<Animals.TypesOfAnimals.length; i++) {
          if (UserInput.equalsIgnoreCase(Animals.TypesOfAnimals[i])) {
            ChosenAnimal = Animals.TypesOfAnimals[i];
            hasSelected = true;
            break;
          }
        }
        if (hasSelected == false) {
          System.out.println("Unfortunately, an error has occured and your input could not be resolved to an animal. Did you misspell the animal's name/number or input a special character? Try again!");
        }
      }
/*      catch (Exception EXCEPTION_AnimalIdentificationLoop) {
        System.out.println("Unfortunately, an error of type \"" + EXCEPTION_AnimalIdentificationLoop + "\" has occurred in the \"AnimalIdentificationLoop\".");
      }*/
          System.out.println("You selected a(n) " + ChosenAnimal + ". Is this correct? (y/n)");
          boolean hasConfirmedSelection = false;
          while (hasConfirmedSelection == false) {
            char InputVerification = UserInputScanner.nextLine().charAt(0);
            if (InputVerification == 'y' || InputVerification == 'Y') {
              System.out.println("Okay! your selection has now been confirmed.");
              //hasSelected = true;  commented out due to it already being set to true.
              hasConfirmedSelection = true;
            }
            else if (InputVerification == 'n' || InputVerification == 'N') {
              System.out.println("Your selection has been declined. Select your animal again");
              hasSelected = false;
              hasConfirmedSelection = true;
            }
            else {
              System.out.println("Couldn't read the inputted character. Please enter it again.");
            }
          }
    } while (hasSelected == false); //part of a do-while loop

    //String UserInput = UserInputScanner.nextLine();
  }
}
class BASE_Animals {
  public String[] TypesOfAnimals = {"lion","tiger","wolf","rabbit","bear","turtle"};
}
