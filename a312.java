import java.util.*;

class StringDemo
{
    public int CountSmall(String str)
    {
        int iCnt = 0;
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class a312
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please string : ");
        String str = sobj.nextLine();
        StringDemo obj = new StringDemo();
        int iRet = obj.CountSmall(str);
        System.out.println("Number of small case letters are : "+iRet);
    }
}