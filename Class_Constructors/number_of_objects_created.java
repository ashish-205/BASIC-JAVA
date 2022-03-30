import java.util.* ;
// count the number of objects created ,count should be static
class Account
{
    static int count=0;
   
   Account()
   {
       count++;
   }
    void display()
    {
        System.out.println("Total objects created are "+count);
    }
    public static void main(String args[])
    {
        Account s1=new Account();
        Account s2=new Account();
        Account s3=new Account();
        s1.display();
       
    }
}
