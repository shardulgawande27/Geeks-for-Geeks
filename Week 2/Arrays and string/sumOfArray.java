public class sumOfArray{


    static int sum(int []arr){
        
        int s = 0;
        int i ;
        
        for(i=0; i<arr.length; i++){

            s += arr[i];

        }

        return s;



    }

    public static void main(String args []){

        int arr[] = {12 , 3, 4 ,5,6};

        System.out.println(sum(arr));

    }



    // static int sum(int []arr) 
	// { 
	// 	int sum = 0; // initialize sum 
	// 	int i; 

	// 	// Iterate through all elements and add them to sum 
	// 	for (i = 0; i < arr.length; i++) 
	// 		sum += arr[i]; 

	// 	return sum; 
	// } 

	// public static void main(String[] args) 
	// { 
	// 	int arr[] = { 12, 3, 4, 15 }; 
	// 	System.out.println("Sum of given array is "+ sum(arr)); 
	// } 

}