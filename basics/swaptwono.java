/* 
public class swaptwono {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swapping, a = " + a + " and b = " + b );

        b = a + b - (a=b);
        
        System.out.println("After Swapping, a = " + a + " b and b = "+ b);
    }
}
*/

public class swaptwono{
    public static void main(String[] args) {
        int x=100,y=200;
        System.out.println("before swap");

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int temp = x;
        x=y;
        y=temp;

        System.out.println("After swap");

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}