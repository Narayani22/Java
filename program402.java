import java.util.*;
import java.io.*;

class program402
{
    public static void main(String Ar[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String FileName = sobj.nextLine();

        System.out.println("File name is : "+FileName);
    
        File fobj = new File(FileName);

        fobj.createNewFile();
    }
}