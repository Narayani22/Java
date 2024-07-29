import java.util.*;

class Student
{
    public String Sname;
    public int Marks;
    public int Rollno;
    
    public static int Generator;

    static
    {
        Generator = 0;
    }

    public Student(String str, int no)
    {
        this.Sname = str;
        this.Marks = no;
        Generator++;
        this.Rollno = Generator;
    }

    public void Display()
    {
        System.out.println("Roll No : "+Rollno+" Name : "+Sname+" Marks : "+Marks);
    }
}

class DBMS
{
    public LinkedList <Student> lobj;

    public DBMS()
    {
        lobj = new LinkedList();
    }

    public void StartDBMS()
    {
        System.out.println("MArvellous Customised DBMS started sucessfull...");
    }

    // All SQL queries should be implemented here

    // insert into student values(______,______);
    public void Insert(String str, int no)
    {
        Student sobj = new Student(str, no);
        lobj.add(sobj);
    }

    // select * from student;
    public void DisplayAll()
    {
        for(Student sref : lobj)
        {
            sref.Display();
        }
    }

    // select * form student where Rollno = 3
    public void DisplaySpecific(int value)
    {
        for(Student sref : lobj)
        {
            if(sref.Rollno == value)
            {
                sref.Display();
                break;
            }
        }
    }

    // select * from student where Name = 'Rutuja';
    public void DisplaySpecific(String str)
    {
        for(Student sref : lobj)
        {
            if(str.equals(sref.Sname))
            {
                sref.Display();
                break;
            }
        }
    }
}

class program497
{
    public static void main(String Arg[])
    {
        DBMS dobj = new DBMS();

        dobj.StartDBMS();

        dobj.Insert("Kartik", 90);
        dobj.Insert("Rutuja", 96);
        dobj.Insert("Ankit", 80);
        dobj.Insert("Pooja", 67);
        dobj.Insert("Ram", 91);

        dobj.DisplayAll();

        dobj.DisplaySpecific(3);

        dobj.DisplaySpecific("Rutuja");
    }
}


