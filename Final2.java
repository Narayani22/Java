
class Base 
{
    public void fun()
    {
        System.out.println("Base fun");
    }
    public final void gun()
    {
        System.out.println("Base gun");
    }
}
class Derived extends Base
{
    public void fun()
    {
        System.out.println("Derived fun");
    } 
    //public void gun()  // na to override because of final method concept
    {
        System.out.println("Derived gun");
    }
}
class Final2 
{
    public static void main(String arr[])
    {

    }
}
