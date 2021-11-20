import java.util.Scanner;

class Matrix 
{
    int[][] arr;
    int m;
    int n;

    Matrix(int mm, int nn) 
    {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }
    void fillarray()
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    Matrix SubMat(Matrix A)
    {
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                this.arr[i][j] = A.arr[i][j] - this.arr[i][j];
            }
        }
        return this;
    }
    void display()
    {
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(arr[i][j] + "\t");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row and columns :: ");
        int mm = sc.nextInt();
        int nn = sc.nextInt();
        Matrix obj1 = new Matrix(mm, nn);
        Matrix obj2 = new Matrix(mm, nn);
        Matrix obj3 = new Matrix(mm, nn);
        System.out.println("Enter the elements of matrix 1:: ");
        obj1.fillarray();
        System.out.println("Enter the elements of matrix 2:: ");
        obj2.fillarray();
        System.out.println("Matrix 1 - Matrix 2 :: ");
        obj3 = obj1.SubMat(obj2);
        obj3.display();
    }
}