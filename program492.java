import java.util.*;

class program492
{
    public static void main(String Arg[])
    {
        LinkedList <Integer> obj = new LinkedList();

        obj.add(11);
        obj.addLast(897);
        obj.add(21);
        obj.add(51);

        obj.remove(1);

        System.out.println("Data is : "+obj);

        for(int no : obj)
        {
            System.out.println(no);
        }
    }
}