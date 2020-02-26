package AnimalPickerProject;
import AnimalPickerProject.Animal;
class Handler {
  static String get(String[] parameters) {
    if (parameters[0].toLowerCase() == "name") {

      return (String.valueOf(Animal.ListOfAnimals.get(Integer.parseInt(parameters[1]))));
    }
    else if (parameters[0] == "length") {
      return (String.valueOf(Animal.ListOfAnimals.size()));
    }
  else {
      System.out.println("invalid input");
      return("");
    }
  }
}
