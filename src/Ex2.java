import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        System.out.println("Saisir le diamètre");
        double diamètre =0;
        Scanner input=new Scanner(System.in);
        diamètre = input.nextDouble();

        double rayon = diamètre/2;
        double surface = rayon * rayon * 3.14;

        System.out.printf("la surface est :%f",surface);
    }
}
