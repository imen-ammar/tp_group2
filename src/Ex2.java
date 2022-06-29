import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args){
        System.out.println("write diameter ");
        double diameter = 0;
        Scanner input=new Scanner(System.in);
        diameter = input.nextDouble();

        double rayon = diameter/2;
        double surface = rayon * rayon * 3.14;

        System.out.printf("la surface est :%f", surface);

    }
}
