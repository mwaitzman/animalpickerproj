import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
////////////static import java.myUsefulPrograms.Log;
class APP {
  /**
  finds animal file, then puts each animal from it into an arraylist,
  then prints arraylist
  **/
  public static void main(String[] args) throws FileNotFoundException {
    //----INITIALIZATION
    initializeProgram();
    String curtoken = "";
//    System.out.println("curtoken created");
    int place = 0;
    for (int i = 0; i < AnimalListFile.length(); i++) {
//      System.out.println("in first for loop" + i);
      if (AnimalListFileScanner.hasNext()) {
        if (place == 0) {
          AnimalListFileAsStringArray[0] = "";
        }
        curtoken = AnimalListFileScanner.next();
  //      System.out.println(curtoken+"aa");
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
    //  System.out.println(place);
    }
//    System.out.println(place + "afgea");
    int arrLength = 0;
//    System.out.println("created arrLength variable");
    for (int i = 0; i < place; i++) {
    //  System.out.println("in for loop");
      if (AnimalListFileAsStringArray[i] != "") {
        arrLength += 1;
      }
      else {
        break;
      }
    }
//    System.out.println("about to create AnimalList variable");
    String[] AnimalList = new String[arrLength];
//    System.out.println(arrLength);
    for (int i = 0; i < AnimalList.length; i++) {
      AnimalList[i] = AnimalListFileAsStringArray[i];
//      System.out.println(AnimalList[i]);
    }
    displayAnimalList();

    System.out.println("End of program");
  }



  static void initializeProgram() {
    System.out.println("Starting the program...");
    /*doConfigFile();*/

    String AnimalListFileLocation = "Animals.txt";
    File AnimalListFile = new File(AnimalListFileLocation);
//    System.out.println("new File created");
    Scanner AnimalListFileScanner = new Scanner(AnimalListFile);
    String[] AnimalListFileAsStringArray = new String[(int)AnimalListFile.length()];
  }

  static void displayAnimalList() {
    System.out.println("The animals are:\n-----");
    for (String Animal: AnimalList) {
      System.out.println(Animal);
    }
    System.out.println("-----");
  }
  /*static void fetchConfigFile() {
    public final File configFile = new File("AnimalPickerConfigFile.cfg");
    if (configFile.exists()) {
      parseConfigFile
    }
    else {
      System.out.println("Config file not found.");
       Creating config file now...
      createConfigFile();
    }
  }*/
}
