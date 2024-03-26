public class PrintDiagonals {

    public static void main(String[] args){

        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<mat.length;i++){
            
                System.out.print(mat[i][i] +" \t");
            }
        }
    }
    

    // time complexity = o(n)
    // aux space = o(1)
