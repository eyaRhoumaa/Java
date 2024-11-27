public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Feline", "Lion", 5, true);
        Animal elephant = new Animal("Pachyderm", "Elephant", 10, false);

        Zoo myZoo = new Zoo("My Zoo", "My City", 20);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);

        myZoo.displayZoo();

        System.out.println(myZoo);

        System.out.println(lion);
    }
}
