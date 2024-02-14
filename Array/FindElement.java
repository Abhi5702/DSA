public class FindElement {

    static int  SearchElement (int arr [],int n,int key){

        for(int i=0;i<n;i++)
        if(arr[i]==key){
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};

        int key = 600;
        int n = arr.length;

        int position = SearchElement(arr, n, key);

        if(position==-1){
            System.out.println("Element not found");
        }
        else
            System.out.println("Element Found at Position: "
                               + (position + 1));
    }
    
}
