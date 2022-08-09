public class search {

    static int search(int arr[], int n , int x) {


        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
            return -1;
    }



    public static void main(String[] args) {
        int arr[] = {10 , 15, 30 , 40};
        int x = 30;
        System.out.println(search(arr, arr.length, x));    }

}


//time complexity is O(n)