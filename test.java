import java.util.Scanner;
public class test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of rows and columns: for first matrix: ");
        int rows = input.nextInt();
        int cols = input.nextInt();
        Matrix_calculator mc = new Matrix_calculator(rows, cols);
       int matrix1[][] = mc.input();
         System.out.print("Enter number of rows and columns: for second matrix: ");
        int rows1 = input.nextInt();
        int cols1 = input.nextInt();
        Matrix_calculator mc1 = new Matrix_calculator(rows1, cols1);
        int matrix2[][] = mc1.input();
        if(matrix1!=null){
        System.out.println("First matrix is: ");
        mc.display(matrix1);}
        System.out.println("Second matrix is: ");
        mc1.display(matrix2);
        
        do{
System.out.print("Menu:\n----------------------\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Edit first matrix\n"
+"5.Edit second matrix\n6.Determinant of first matrix\n7.Determinant of second matrix\n8.Display both matricies\n9.Exit\nEnter your choice: ");
int choice = input.nextInt();
if(choice==1) {
        int result[][]= mc.add(matrix1, matrix2);
        if(result!=null)
        mc.display(result);
}
if(choice==2) {
        int result[][]= mc.subtract(matrix1, matrix2);
              if(result!=null)
  mc.display(result);
}
if (choice==3) {
        int result[][]= mc.multiply(matrix1, matrix2);
               if(result!=null)
 mc.display(result);
        
}
if(choice==4){ mc.Edit_Matrix(matrix1);
        mc.display(matrix1);
}

if(choice==5){ mc1.Edit_Matrix(matrix2);
        mc1.display(matrix2);
}
if(choice==6){
    if(rows==2 && cols==2){
        int det = mc.GetDeterminant2(matrix1);
        System.out.println("Determinant of first matrix is: "+det);
    }
    else if (rows==3 && cols==3){
        int det = mc.GetDeterminant3(matrix1);
        System.out.println("Determinant of first matrix is: "+det);
    }
    else{
        System.out.println("Determinant can only be calculated for 2x2 and 3x3 matrices.");
    }
}
if(choice==7){
    if(rows1==2 && cols1==2){
        int det = mc1.GetDeterminant2(matrix2);
        System.out.println("Determinant of second matrix is: "+det);
    }
    else if (rows1==3 && cols1==3){
        int det = mc1.GetDeterminant3(matrix2);
        System.out.println("Determinant of second matrix is: "+det);
    }
    else{
        System.out.println("Determinant can only be calculated for 2x2 and 3x3 matrices.");
    }
}
if(choice==8){
    System.out.println("First matrix is: ");
    mc.display(matrix1);
    System.out.println("Second matrix is: ");
    mc1.display(matrix2);
}
if (choice==9){System.out.println("Good bye!");
break;}
                
        }while(true);


       
}
}
