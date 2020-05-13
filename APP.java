import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
class APP {
  public static void main(String[] args) throws FileNotFoundException {
    //----INITIALIZATION
    System.out.println("Starting the program...");

    String AnimalListFileLocation = "Animals.txt";
    File AnimalListFile = new File(AnimalListFileLocation);
    Scanner AnimalListFileScanner = new Scanner(AnimalListFile);
    String[] AnimalListFileAsStringArray = new String[(int)AnimalListFile.length()];
    String curtoken = "";
    int place = 0;
    for (int i = 0; i < AnimalListFile.length(); i++) {
      if (AnimalListFileScanner.hasNext()) {
        if (place == 0) {
          AnimalListFileAsStringArray[0] = "";
        }
        curtoken = AnimalListFileScanner.next();
        for (int j = 0; j < curtoken.length(); j++) {
          if (curtoken.charAt(j) == ',' || curtoken.charAt(j) == ';') {

            place += 1;
            AnimalListFileAsStringArray[place] = "";
          }
          else if (curtoken != ""){
            AnimalListFileAsStringArray[place] += curtoken.charAt(j);
          }
        }
      }
      else {

      }
    }
    int arrLength = 0;
    for (int i = 0; i < place; i++) {
      if (AnimalListFileAsStringArray[i] != "") {
        arrLength += 1;
      }
      else {
        break;
      }
    }

    String[] AnimalList = new String[arrLength];
    for (int i = 0; i < AnimalList.length; i++) {
      AnimalList[i] = AnimalListFileAsStringArray[i];
    }
    displayAnimalList(AnimalList);


    System.out.println("End of program");
  }
  static void displayAnimalList(String[] AnimalList) {
    System.out.println("The animals are:\n-----");
    for (String Animal: AnimalList) {
      System.out.println(Animal);
    }
    System.out.println("-----");
  }
}
