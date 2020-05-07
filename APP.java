import java.util.Scanner;
import java.io.File;
////////////static import java.myUsefulPrograms.Log;
class APP {
  public static void main(String[] args) {
    initializeProgram();
  }
  static void initializeProgram() {
    String AnimalListFileLocation = "Animals.txt";
    //fetchConfigFile();
    setupAnimalList();
  }
  static void setupAnimalList() {}
  static void fetchAnimalList() {
    File AnimalListFile = new File(AnimalListFileLocation);
  }
  /*static void fetchConfigFile() {
    public final File configFile = new File("AnimalPickerConfigFile.cfg");
    if (configFile.exists()) {

    }
    else {
      console.log()
    }
  }*/
}
