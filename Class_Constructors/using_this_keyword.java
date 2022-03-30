import java.util.* ;
//if we want the name of the variable and name of the parameter to be same then we use this keyword
//this keyword refers to the current object
class Account
{
    int account;
    String name;
    float salary;

    Account(int account,String name,float salary)
    {
        this.account=account ;
        this.name=name;
        this.salary=salary;
    }
    public static void main(String args[])
    {
        Account student=new Account(123,"Ashish",150000);

        System.out.println("Name is "+student.name);
        System.out.println("Account number is "+student.account);
        System.out.println("Salary is "+student.salary);
    }
}
