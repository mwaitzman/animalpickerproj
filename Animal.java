package AnimalPicker;
import java.util.ArrayList;
public class Animal {
  final String commonName;
  final String Kingdom, Phylum, Class, Order, Suborder, Family, Subfamily, Genus, Species, Species_BinomialName;
  Final String[] Subspecies, Subspecies_TrinomialName;
  final String[] Genders;
}
Animal lion = new Animal("lion", "Animalia", "Chordata", "Mammalia", "Carnivora", "Feliformia", "Felidae", "Pantherinae", "Panthera", "P. leo", "Panthera leo", ["P. l. leo", "P. l. melanochaita", "P. l. sinhaleyus"], ["Panthera leo leo", "Panthera leo melanochaita", "Panthera leo sinhaleyus"]);

ArrayList<Animal> ListOfAnimals = new ArrayList<>(1);
