import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x=0,y=1,z=0,n;
        n=sc.nextInt();
        while(z<=0){
            System.out.println(z);
            x=y;
            y=z;
            z=x+y;

        }
    }
    
}
