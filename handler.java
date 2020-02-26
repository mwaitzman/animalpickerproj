package AnimalPicker;
class Handler {
  import static AnimalPicker.Animal;
  protected get(String[] parameters) {
    if (parameters[0].toLowerCase == "name") {

      return ListOfAnimals.Animal[parameters[1]];
    }
    else if (parameter[0] == "length") {
      return (ListOfAnimals.length());
    }
  /else {
      System.out.println("invalid input");
      return;
    }
  }
}
