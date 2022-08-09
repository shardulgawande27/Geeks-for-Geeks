import java.util.Scanner;

public class Nth_term_gp {

    public static int Nth_term_gp (int a , int r, int N){

        int n = a * (int) (Math.pow(r,N-1)) ;   // formula for G.P = Tn = a * r^(N-1)
        return n;

    }

    public static void main (String [] args){

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int r = s.nextInt();
        int n = s.nextInt();
        System.out.print(Nth_term_gp(a,r,n));


    }


}
