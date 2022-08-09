import java.util.Scanner;

public class pyramid {
    
    public static void main (String args []){


        Scanner s = new Scanner(System.in);

        int n = s.nextInt();


        // PATTERN USING WHIEL LOOP


        // int i = 1;

        // while(i<=n){
        //     int j = 1;
            
        //     while(j<=(n-i)){
        //         System.out.print(" ");
        //         j++;
        //     }

        //     int k =1;
        //     while(k <=(2*i-1)){
        //         System.out.print("x");
        //         k++;
        //     }

        //     i++;
        //     System.out.println();
        // }
        
        
        
        
        // PATTERN USING FOR LOOP

        
        for(int i = 1 ; i<=n ; i++)
        {

            for(int j = n-1 ; j>=i ; j-- ){
                System.out.print(" ");

            }

            for(int k = 1; k<=(2*i-1); k++){
                System.out.print("x");
            }
            System.out.println();
        }
        

    }


}
