import java.util.*;

class StringDemo
{
    public boolean ChkVowel(String str)
    {
        boolean bCnt = true;
        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == 'a' || Arr[i] == 'e' || Arr[i] == 'i' || Arr[i] == 'o' || Arr[i] == 'u')
            {
                return true;
            }
            else 
            {
                return false;
            }
        }
        return bCnt;
    }
}
class a314
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please string : ");
        String str = sobj.nextLine();
        StringDemo obj = new StringDemo();
        boolean bRet = obj.ChkVowel(str);
        if(bRet == true)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}