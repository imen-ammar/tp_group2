import java.util.Scanner;
import java.time.YearMonth;
public class Ex5 {
    public static void main(String[] args){

        int age;
        int birthyear;
        Scanner inputage=new Scanner(System.in);
        System.out.println("write your age");
        age=inputage.nextInt();

        int year = YearMonth.now().getYear();
        birthyear = year - age;

        System.out.printf("Votre année de naissance est : %d",birthyear);
    }
}
