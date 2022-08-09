import java.util.Scanner;

public class primeNumber {


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 2 ; i<a; i++){

            if (a%i == 0){
                System.out.println("a is not a prime number");
                break;
            }
            else{
                System.out.println("a is a prime number");
                break;
            }

        }



    }


}
