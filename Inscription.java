import java.util.Scanner;

public class Inscription {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue! Veuillez vous inscrire.");

        System.out.print("Nom: ");
        String nom = scanner.nextLine();

        System.out.print("Prénom: ");
        String prenom = scanner.nextLine();

        System.out.print("Âge: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // pour vider la ligne

        System.out.print("Date de naissance: ");
        String dateNaissance = scanner.nextLine();

        System.out.print("Système éducatif: ");
        String systemeEducatif = scanner.nextLine();

        System.out.print("Classe: ");
        String classe = scanner.nextLine();

        System.out.print("École: ");
        String ecole = scanner.nextLine();

        System.out.println("\nInscrption reussi!");

    }
}
