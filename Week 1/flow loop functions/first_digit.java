import java.util.Scanner;

public class first_digit {


    public static int firstDigit(int n){
        double power = Math.log10(n);
        int p = (int)power;
        int a = (int)Math.pow(10,p);
        int ans = n/a;
        return ans;

    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(firstDigit(n));

    }



}
