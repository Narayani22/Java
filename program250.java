import java.util.*;

class Numbers
{
    // Method
    public void EvenFactorsDisplay(int iNo)
    {

    }
}
class program250 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter number : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        nobj.EvenFactorsDisplay(iNo);
    }
}