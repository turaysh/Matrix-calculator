import java.util.Scanner;
public class Matrix_calculator {
    private int rows;
    private int cols;

public Matrix_calculator(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }
    public int[][] input(  ){
        int a[][] = new int[rows][cols];
        Scanner input = new Scanner(System.in);
        for (int i=0; i<rows;i++){
            for (int j =0;j<cols;j++){
                System.out.println("enter element at position "+i+" "+j+" for first matrix: ");
            int element = input.nextInt();
            a[i][j] = element;
    }
        } 
        return a;
    }
public int[][] multiply(int[][] a, int[][] b) {
    if(cols != b.length){
        System.out.println("Matrices cannot be multiplied due to incompatible dimensions.");
        return null;}
        int[][] result = new int[rows][cols];
         for(int m=0;m<rows;m++){
 int y =0;
for (int i=0;i<rows;i++){
    for(int x=0;x<cols;x++){
        result[y][m] += a[y][x]*b[x][m]; 
    }
     y++;
}}
for(int i =0;i<rows;i++){
    for(int x=0;x<cols;x++){
        System.out.print(result[i][x]+" ");
    }
    System.out.println();
}

        return result;
    }
    public int [][]add(int [][]a, int[][]b){
if(rows != b.length || cols != b[0].length){
    System.out.println("Matrices cannot be added due to incompatible dimensions.");
    return null;}
        int [][]result = new int [rows][cols];
        for(int i=0; i<rows;i++){
            for(int j=0;j<cols;j++)
                result[i][j]=a[i][j]+b[i][j];
            }
        return result;}
    public int [][]subtract(int [][]a, int[][]b){
        if(rows != b.length || cols != b[0].length){
    System.out.println("Matrices cannot be subtracted due to incompatible dimensions.");
    return  null;}

              int [][]result = new int [rows][cols];
        for(int i=0; i<rows;i++){
            for(int j=0;j<cols;j++)
                result[i][j]=a[i][j]-b[i][j];
            }
        return result;
    }
    public void display(int [][]a){
        System.out.println("resultant matrix is: ");
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
