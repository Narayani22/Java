// same as constant characteristics of class from c++
class Demo
{
    public int No1;
    public final int No2 = 11; // const int no2;
    public final int No3;  // const int no3;

    public Demo()
    {
        No1 = 0;
        No3 = 21;  // na in c++
    }
}
class Final1 
{
    public static void main(String arr[])
    {
        final int i = 51;  //const int i =51;
        Demo obj = new Demo();
        obj.No1++;
    //  obj.No2++;
    //  obj.No3++;
    }    
}

