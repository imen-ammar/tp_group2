import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        String nom;
        String prenom;
        int age=0;

        Scanner inputNom=new Scanner(System.in);
        System.out.println("Saisir votre nom : ");
        nom = inputNom.nextLine();

        Scanner inputPrenom=new Scanner(System.in);
        System.out.println("Saisir votre prenom : ");
        prenom = inputPrenom.nextLine();

        Scanner inputAge=new Scanner(System.in);
        System.out.println("Saisir votre age : ");
        age = inputAge.nextInt();

        System.out.printf("Vous vous appelez %s %s, et vous avez %d ans.",prenom,nom,age);
    }
}
