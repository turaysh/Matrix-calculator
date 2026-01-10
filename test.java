import java.util.Scanner;
public class test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
System.out.print("Enter number of rows and columns: for first matrix: ");
        int rows = input.nextInt();
        int cols = input.nextInt();
        Matrix_calculator mc = new Matrix_calculator(rows, cols);
        System.out.print("Enter number of rows and columns: for second matrix: ");
        int rows1 = input.nextInt();
        int cols1 = input.nextInt();
       int matrix1[][] = mc.input();
        int matrix2[][] = new int[rows1][cols1];
        mc.display(matrix1);

       
}
}
