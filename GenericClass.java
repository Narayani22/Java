
class Demo<T> 
{
    public T no1;
    public T no2;

    public Demo(T a, T b)
    {
        no1 = a;
        no2 = b;
    }

    public void Display()
    {
        System.out.println(no1);
        System.out.println(no2);
    }
}
class GenericClass
{
    
    public static void main(String Ar[])
    {
        Demo <Integer> iobj= new Demo<Integer>(11,21);
        iobj Display();

        Character cArr[] = {'a','b','c','d'};
        Display(cArr);

        Float fArr[] = {10.9f,90.5f,89.0f};
        Display(fArr);
    }
}