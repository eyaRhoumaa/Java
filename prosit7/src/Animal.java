public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("L'âge d'un animal ne peut pas être négatif : " + age);
        }
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal [Family: " + family + ", Name: " + name + ", Age: " + age + ", Is Mammal: " + isMammal + "]";
    }
}
