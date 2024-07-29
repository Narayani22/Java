import java.util.*;

class StringDemo
{
    public void Reverse(String str)
    {
        char Arr[] = str.toCharArray();
        char start = str;
        char end = str;
        char temp = '\0';
    
        while(end != '\0')
        {
            end++;
        }
        end--;
    
        while(start < end)
        {   
            temp = start;
            start = end;
            end = temp;
    
            start++;
            end--;
        }
    }
}

class a315
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please string : ");
        String str = sobj.nextLine();
        StringDemo obj = new StringDemo();
        int iRet = obj.StringDemo(str);
        System.out.println("Number of small case letters are : "+iRet);
    }
}