public class RemoveDuplicate {

    /**
     * @param arr
     * @return
     */
    static int RemoveDuplicate(int arr[]){ 

        int n=arr.length;
        int temp=1;
// REMOVE DUPLICATES
        for(int i=1;i<n;i++){
            if(arr[i]!= arr[temp-1]){
                arr [temp] = arr[i];
                arr[i]=0;
                temp++;
            }
        }
        return temp;
    }

        public static void main(String args[]){
             
            int arr[] = {10,10,20,20,20,30,40,40,20,40};
            int n = arr.length;
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            int newLength=RemoveDuplicate(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();

            for(int i=0;i<newLength;i++){
                System.out.print(arr[i]+" ");
            }
        }
}
    
