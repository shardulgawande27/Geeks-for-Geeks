import java.util.Scanner;

public class sum_of_n {


    public static int SumOfN(int a, int d, int N) {

        int ans = N/2 * (2* a + (N-1) * d); // or (n * (n + 1))/2
        return ans;

    }


    public static void main (String [] args){

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int d = s.nextInt();
        int N = s.nextInt();
        System.out.print(SumOfN(a,d,N));


    }



}
