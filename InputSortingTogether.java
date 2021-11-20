import java.util.Scanner;

public class InputSortingTogether
{
    public void solve()
    {
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        DynamicArray ar = new DynamicArray();
        while (run)
        {
            System.out.print("1. Insert\n2. Display\n3. Exit\nEnter your choice: ");
            int ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.print("Enter the data: ");
                    int ele = sc.nextInt();
                    ar.insert(ele);
                    break;
                case 2:
                    ar.display();
                    break;
                case 3:
                    run = false;
                    break;
                default:
                    System.out.println("Please enter a valid choice...");
            }
            System.out.print("Do you wish to continue [y/n]: ");
            char cont = sc.next().trim().charAt(0);
            run = cont == 'y' || cont == 'Y';
        }
    }

    public static void main(String[] args) 
    {
        InputSortingTogether ob = new InputSortingTogether();
        ob.solve();
    }
}

class DynamicArray
{
    int[] ar;
    int top;
    public DynamicArray()
    {
        ar = new int[5];
        top = 0;
    }

    public void insert(int ele)
    {
        if (top < ar.length)
        {
            ar[top] = ele;
            top += 1;
        } 
        else
        {
            int len = 2 * ar.length;
            int[] ar2 = new int[len];
            for (int i = top-1; i >= 0; i--)
            {
                ar2[i] = ar[i];
            }
            ar = new int[2 * ar.length];
            ar = ar2;
            ar[top] = ele;
            top += 1;
        }
    }

    public void display()
    {
        for (int i = 0; i < top; i++)
        {
            System.out.print(ar[i] + "   ");
        }
        System.out.println();
    }
}