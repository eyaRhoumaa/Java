import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;
    private String name;
    private String city;
    private int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new ArrayList<>(nbrCages);
    }

    public void addAnimal(Animal animal) throws ZooFullException {
        if (animals.size() >= nbrCages) {
            throw new ZooFullException("Le zoo est plein ! Impossible d'ajouter l'animal : " + animal);
        }
        animals.add(animal);
        System.out.println("Animal ajouté : " + animal);
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
        System.out.println("Number of Animals: " + animals.size());
        System.out.println("Animals in the Zoo: ");
        for (Animal animal : animals) {
            System.out.println("  - " + animal);
        }
    }

    @Override
    public String toString() {
        return "Zoo Name: " + name + ", City: " + city + ", Number of Cages: " + nbrCages + ", Animals Count: " + animals.size();
    }
}
