import java.util.*;

class program486
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();

        String newstr = str.trim();

        String Arr[] = newstr.split(" ");

        System.out.println("Number of words are : "+Arr.length);
    }
}

