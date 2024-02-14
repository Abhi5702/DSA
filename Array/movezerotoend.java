public class movezerotoend {

    static int move(int arr[], int n){
    int temp = 0;

    for(int i =0;i<n;i++){
        if(arr[i]!=0){

            int x = arr[i];
            arr[i] = arr[temp];
            arr[temp] = x;

            temp++;
        }
    }
    return temp;
    
    }

    public static void main(String[] args) {

    int arr[] = { 10, 15, 0, 0, 25, 0, 20 };    
    int n = arr.length;
    int nonZeroCount = move(arr, n);
    for(int i = 0;i<n;i++)
    {
        System.out.print(arr[i] + " ");
    }

    System.out.println("\n");
    for(int i = 0;i<nonZeroCount;i++){
        System.out.print(arr[i]+" ");
    }
}

}

