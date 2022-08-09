import java.util.Scanner;

public class table {


    public static void main(String args []){

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int i = 1;
        
        while(i<=10){

            System.out.println(i*a);
            i = ++i;

        }

        // for(int i=1; i<=10; i++)
        // {
        //     System.out.println(i*a);
        // }


    }


    
}
