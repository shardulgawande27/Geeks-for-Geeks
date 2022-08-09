import java.util.Scanner;

public class largest__of_three {

    public static void main (String args []){

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();


//        if (a>=b && a>=c){
//            System.out.println("a is greater");
//        }
//
//        else if (b>=a && b>=c){
//            System.out.println("b is grreater");
//        }
//
//        else {
//            System.out.println("c is greater");
//        }

         int ans_1 = Math.max(a,b);
         int ans = Math.max(ans_1,c);
         System.out.println(ans);
    }


}
