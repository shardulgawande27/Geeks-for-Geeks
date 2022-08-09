import java.util.Scanner;

public class to_n {

    // static int i = 1;
    // public static void main(String[] args)
    // {
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();
    
        
 
    //     if (i <= n)
    //     {
    //         System.out.printf("%d ", i++);
    //         main(null);
    //     }
    // }


    
    // static int i = 1;
 
    // public static void main(String[] args)
    // {
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();

    //     if (i <= n)
    //     {
    //         System.out.printf("%d ", i++);
    //         main(null);
    //     }
    // }


    static void Numbers(int num){

        if(num<=0)
            return;
        else
         Numbers(num - 1);
         System.out.print(num + " ");
    }

    public static void main(String args []){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Numbers(n);

    }



}
