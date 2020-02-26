package AnimalPickerProject;
import java.util.ArrayList;
class Animal {
/*  final String commonName;
  final String Kingdom, Phylum, Class, Order, Suborder, Family, Subfamily, Genus, Species, Species_BinomialName;
  final String[] Subspecies;
  final String[] Subspecies_TrinomialName;
  final String[] Genders;*/

   Animal lion = new Animal("lion", "Animalia", "Chordata", "Mammalia", "Carnivora", "Feliformia", "Felidae", "Pantherinae", "Panthera", "P. leo", "Panthera leo", new String[]{"P. l. leo", "P. l. melanochaita", "P. l. sinhaleyus"}, new String[]{"Panthera leo leo", "Panthera leo melanochaita", "Panthera leo sinhaleyus"}, new String[]{"male", "female"});

  public static ArrayList<Animal> ListOfAnimals = new ArrayList<Animal>(3);
  protected Animal(String commonName,String Kingdom, String Phylum, String Class, String Order, String Suborder, String Family, String Subfamily, String Genus, String Species, String Species_BinomialName, String[] Subspecies, String[] Subspecies_TrinomialName, String[] Genders){
  ListOfAnimals.add(1, lion);
}
}
