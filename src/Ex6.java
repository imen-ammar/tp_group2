import java.util.Scanner;


public class Ex6 {
    static int checkPosNeg(int number) {
        if(number >0){
            System.out.println("positive");
        }else {
            System.out.println("negative");
        }
        return number ;
    }

    public static void main(String[] args){

        int number;
        boolean result ;
         int result2;


        Scanner inputpositive = new Scanner(System.in);
        System.out.println("enter a number");
        number = inputpositive.nextInt();
        result2 = checkPosNeg(number);

         if(number ==0){
            System.out.println("Le nombre est zéro (et il est pair)");
         } else {
             result=number%2==0;
             if(result ){
                 System.out.printf("number %d is pair ", number);
             } else {
                 System.out.printf("number %d is odd ", number);
             }

         }
    }

}
