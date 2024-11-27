public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("My Zoo", "My City", 3);

        try {
            Animal lion = new Animal("Feline", "Lion", 5, true);
            myZoo.addAnimal(lion);
            System.out.println("Nombre d'animaux après ajout : " + myZoo);

            Animal elephant = new Animal("Pachyderm", "Elephant", 10, false);
            myZoo.addAnimal(elephant);
            System.out.println("Nombre d'animaux après ajout : " + myZoo);

            Animal tiger = new Animal("Feline", "Tiger", -3, true);
            myZoo.addAnimal(tiger);

        } catch (InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (ZooFullException e) {
            System.out.println("Erreur : " + e.getMessage());
        } finally {
            System.out.println("\nÉtat final du zoo : ");
            myZoo.displayZoo();
        }
    }
}
