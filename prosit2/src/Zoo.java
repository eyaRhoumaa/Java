import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals; // Utilisation d'une liste pour une flexibilité accrue
    private String name;
    private String city;
    private int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new ArrayList<>(25); // Capacité maximum : 25 animaux
    }

    public void addAnimal(Animal animal) {
        if (animals.size() < 25) {
            animals.add(animal);
        } else {
            System.out.println("Le zoo a atteint sa capacité maximale !");
        }
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
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

