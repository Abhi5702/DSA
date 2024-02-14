public class bubbleSort {

    public static void main(String[]args){
        int temp;
        int [] a  = {45,67,45,34,23,12};


        for(int i=0;i<a.length;i++){

            for(int j=0;j<a.length;i++){


                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
    
}
