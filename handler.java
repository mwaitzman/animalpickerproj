package AnimalPickerProject;
import AnimalPickerProject.Animal;
class Handler {
  protected static String get(String[] parameters) {
    if (parameters[0].toLowerCase() == "name") {

      return ListOfAnimals.Animal[Integer.parseInt(parameters[1])];
    }
    else if (parameters[0] == "length") {
      return (ListOfAnimals.length());
    }
  else {
      System.out.println("invalid input");
      return("");
    }
  }
}
