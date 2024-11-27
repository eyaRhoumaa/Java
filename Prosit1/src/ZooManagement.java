import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nbrCages;
        String zooName;

        try {
            System.out.print("Entrez le nom du zoo : ");
            zooName = scanner.nextLine();

            System.out.print("Entrez le nombre de cages : ");
            nbrCages = scanner.nextInt();

            if (nbrCages <= 0) {
                System.out.println("Le nombre de cages doit être un entier positif !");
                return;
            }

            System.out.println(zooName + " comporte " + nbrCages + " cages");
        } catch (Exception e) {
            System.out.println("Données invalides. Veuillez entrer des valeurs correctes.");
        } finally {
            scanner.close();
        }
    }
}
