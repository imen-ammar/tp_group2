import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args){
        int a;
        int b ;
        int c;
        Scanner inputa=new Scanner(System.in);
        System.out.println("Saisir valur pour a : ");
        a= inputa.nextInt();

        Scanner inputb=new Scanner(System.in);
        System.out.println("Saisir valur pour b: ");
        b= inputb.nextInt();

        Scanner inputc=new Scanner(System.in);
        System.out.println("Saisir valur pour c : ");
        c= inputc.nextInt();

        System.out.printf("Les valeurs entrées sont : a = %d, b = %d et c = %d",a,b,c);

        int temp;
        temp=a;
        a=c;
        c=b;
        b=temp;
        System.out.printf( "Les valeurs permutées sont : a =%d, b = %d et c = %d",a,b,c);
    }
}
