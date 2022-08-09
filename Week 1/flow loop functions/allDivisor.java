import java.util.Scanner;

public class allDivisor {

    public static void main(String args []){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int ans = 1;

        for (int i = 1 ; i<=a; i++){
            if (a%i==0){
                System.out.println(i);
            }
        }


    }


}
