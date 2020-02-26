package AnimalPickerProject;
//import AnimalPicker.*;
//import AnimalPicker.Handler;
import AnimalPickerProject.Handler;
import java.util.Scanner;
public class AnimalPicker {
  public static void main(String[] args) {
    Handler AnimalHandler = new Handler();///////////////
  //  PossibleAnimals = DB_Animals.get("all", "name");
    Scanner UserInputScanner = new Scanner(System.in);
    boolean hasSelectedAnimalType = false;
    String ChosenAnimal = null;
    String UserInput;
    int ChosenAnimalByNumber;
    System.out.println("choose an animal from the following list (type the number to the right of the animal you would like to select OR type the the name of the animal you would like to select (case doesn't matter)):");
    System.out.println("--------------------");
    for (int i=0; i<Integer.parseInt(Handler.get(new String[]{"length"})); i++) {
      System.out.println("#" + (i+1) + ": " + Handler.get(new String[]{"name", String.valueOf(i)}));
    }
    System.out.println("--------------------");
    do {
      UserInput = UserInputScanner.nextLine();
      try {
        ChosenAnimalByNumber = Integer.parseInt(UserInput);
        if (ChosenAnimalByNumber < 0) {
          System.out.println("The negative number you entered has been automatically converted to its positive counterpart.");
        }
        try {
        ChosenAnimal = Handler.get(new String[]{"name", String.valueOf(Math.abs(ChosenAnimalByNumber)-1)});
        hasSelectedAnimalType = true;
        }
        catch (ArrayIndexOutOfBoundsException IntegerTooHighException) {
          System.out.println("Cannot find an animal with " + ChosenAnimalByNumber + " as an ID. Try again!");//TO-DO: automatically go back to selection without displaying anything else (also append something along the lines of "please try (inputting a selection) again" to this line) -- curently user needs to press enter once before re-selection -- use a while loop maybe?
          hasSelectedAnimalType = false;
        }
      }
      catch (NumberFormatException ChosenAnimal_NFE) {
        for(int i=0; i<Integer.parseInt(Handler.get(new String[]{"length"})); i++) {
          if (UserInput.equalsIgnoreCase(Handler.get(new String[]{"name", String.valueOf(i)}))) {
            ChosenAnimal = Handler.get(new String[]{"name"});
            hasSelectedAnimalType = true;
            break;
          }
        }
        if (hasSelectedAnimalType == false) {
          System.out.println("Unfortunately, an error has occured and your input could not be resolved to an animal. Did you misspell the animal's name/number or input a special character? Try again!");
        }
      }
/*      catch (Exception EXCEPTION_AnimalIdentificationLoop) {
        System.out.println("Unfortunately, an error of type \"" + EXCEPTION_AnimalIdentificationLoop + "\" has occurred in the \"AnimalIdentificationLoop\".");
      }*/
      if (hasSelectedAnimalType == true) {
          System.out.println("You selected a(n) " + ChosenAnimal + ". Is this correct? (y/n)");
          boolean hasConfirmedSelection = false;
          while (hasConfirmedSelection == false) {
            char InputVerification = UserInputScanner.nextLine().charAt(0);
            if (InputVerification == 'y' || InputVerification == 'Y') {
              System.out.println("Okay! your selection has now been confirmed.");
              //hasSelectedAnimalType = true;  commented out due to it already being set to true.
              hasConfirmedSelection = true;
            }
            else if (InputVerification == 'n' || InputVerification == 'N') {
              System.out.println("Your selection has been declined. Please select your animal again.");
              hasSelectedAnimalType = false;
              hasConfirmedSelection = true;
            }
            else {
              System.out.println("Couldn't read the inputted character. Please enter it again.");
            }
          }
        }
    } while (hasSelectedAnimalType == false); //part of a do-while loop

    //String UserInput = UserInputScanner.nextLine();
  }
}
