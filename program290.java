import java.util.*;
/*
    Row = 4
    Col = 4

    1   2   3   4
    5   6   7   8
    9   10  11  12
    13  14  15  16
*/

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iCnt = 1;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(iCnt+"\t");
                iCnt++;
            }
            System.out.println();
        }
    }
}

class program290
{
    public static void main(String a[])
    {
        Pattern pobj = new Pattern();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int i = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        int j = sobj.nextInt();

        pobj.Display(i,j);
    }
}


