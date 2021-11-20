import java.util.*;
public class Matrix_Image
{
    int r, c;
    int[][] A = new int [r][c];
    int[][] B = new int [c][r];
    public Matrix_Image()
    {
        r = 0;
        c = 0;
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                A[i][j] = 0;
                B[i][j] = 0;
            }
        }
    }

    public Matrix_Image(int mm, int nn)
    {
        r = mm;
        c = nn;
    }

    public void get_mat()
    {
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
    
    void mirror_image() 
    {
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                B[i][j] = A[r-1-i][c-1-j];
            }
        }
    }
    
    void show() 
    {
        System.out.println("Original Matrix");
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                System.out.printf("%d  ", A[i][j]);
            }
            System.out.println();
        }
        System.out.println("Mirror Matrix");
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                System.out.printf("%d  ", B[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int r, c;
        r = sc.nextInt();
        c = sc.nextInt();
        Matrix_Image obj = new Matrix_Image(r, c);
        obj.get_mat();
        obj.mirror_image();
        obj.show();
        sc.close();
    }
}
