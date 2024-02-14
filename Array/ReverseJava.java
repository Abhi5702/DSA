import java.util.Scanner;

public class ReverseJava {

    static void reverse(int arr[], int n){
        int start = 0;
        int end = n-1;
    while(start<end){

        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;

        start++;
        end--;
    }
}

public static void main(String[] args) {

    int arr[] = {10,20,30,40,50};
    int n = arr.length;
for(int i = 0; i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
System.out.println();
reverse(arr, n);

 
for(int i=0; i<arr.length; i++) {
System.out.print(arr[i]+" ");
}

}

}
