import java.util.*;

class StringDemo
{
    public int CountCapital(String str)
    {
        int iCnt = 0;
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class a311
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please string : ");
        String str = sobj.nextLine();
        StringDemo obj = new StringDemo();
        int iRet = obj.CountCapital(str);
        System.out.println("Number of capital case letters are : "+iRet);
    }
}