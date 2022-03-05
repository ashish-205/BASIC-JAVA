//Create a class Student with states Rollno,name,university,branch and behaviours include show,set
class Student 
{
    int roll_no;
    String name;
    String university;
    String branch;
    
    void set(int roll,String iname,String univ,String Branch1)
    {
        roll_no=roll;
        name=iname;
        university=univ;
        branch=Branch1;
    }

    void show()
    {
        System.out.println("Roll number is "+roll_no);
        System.out.println("Name is "+name);
        System.out.println("University is "+university);
        System.out.println("Branch is "+branch);
        
    }
    public static void main(String args[])
    {
        Student s1=new Student();                                           //object creation
        s1.set(13,"ashish","Graphic Era Hill University","CSE");            //setting the values (hardcoded values)
        s1.show();
    }
}
