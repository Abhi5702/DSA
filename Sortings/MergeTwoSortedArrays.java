package Sortings;

public class MergeTwoSortedArrays {


    public static void mergearrays(int a[],int b[]){

        int m=a.length;
        int n=b.length;
        
        int i=0;
        int j=0;

        while(i<m && j<n)

        if(a[i]<=b[j]){

            System.out.println(a[i]);
            i++;
        }
        else{
        System.out.println(b[j]);
        j++;
    }
}
    while(i<m){
        System.out.println(a[i]);
        i++;
    }

    while(j<n){

        System.out.println(b[j]);
        j++;
    }
}

    public static void main (String[] args){
    int a[] = {10,20,50,60,70};
    int b[] = {5,15,50};
    mergeArrays(a,b);
  
}
