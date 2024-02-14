import java.util.*;

public class MaxofTwo {
    /**
     * @param args
     */
    public static void main(String[] args){

        int a,b;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter Second number");
        b=sc.nextInt();
        if(a>b){
            System.out.println("Max number" +a);
        }
        else{
            System.out.println("Max number" +b);
        }

    }
    
}
