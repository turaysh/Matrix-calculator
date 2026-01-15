import java.math.*;
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
public int [][] Edit_Matrix(int[][]a){
    Scanner input = new Scanner(System.in);
    for(int i=0;i<rows;i++)
        for(int j =0;j<cols;j++){
    
    System.out.print("Enter the value of postion "+i+" "+j);
          int element = input.nextInt();
            a[i][j] = element;
        }
return a;
}
public int GetDeterminant2(int[][]a){
 int  det = a[0][0]*a[1][1] - a[0][1]*a[1][0];
 return det;
    
}
public int GetDeterminant3(int[][]a){
    
    int det =0;
    for(int i=0;i<3;i++){
        int x = i-1; 
        int y = 3-i;
        int [][] temp = new int[2][2];
    for(int j=0;j<2;j++){
        if(x==1) x=0;
        temp[j][0] = a[j+1][Math.abs(x)];
        
        if(y==3) y =2;
        temp[j][1]=a[j+1][y];
}
System.out.println(temp[0][0]+" "+temp[0][1]+"\n"+temp[1][0]+" "+temp[1][1]);
if(i==1)
    det -= a[0][i]*GetDeterminant2(temp);
else
   det += a[0][i]*GetDeterminant2(temp);    
    }
 return det;
}
}