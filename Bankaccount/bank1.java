// Create a class Account having states as account number,name,amount and behaviours include insert,deposit,checkbalance,display and input values using command line arguments
class Account{
    int account;
    String name;
    float amount;

    void insert(int acc,String iname,float amt)
    {
        account=acc;
        name=iname;
        amount=amt;
    }
    void deposit(float amount1)
    {
        amount+=amount1;
    }
    void checkbalance()
    {
        System.out.println("Balance is "+amount);
    }
    void withdraw(float amn)
    {
        if(amn<=amount)
        {
            System.out.println("Withdrawing amount "+amn);
            amount-=amn;
        }
        else
        {
            System.out.println("Not enough money to withdraw");
        }
    }
    void display()
    {
        System.out.println("Name is "+name);
        System.out.println("Account number is "+account);
        System.out.println("Available Amount is "+amount);
        
    }

    public static void main(String hello[])
    {
        Account member=new Account();
        int acc1=Integer.parseInt(hello[0]);
        float amt=Float.parseFloat(hello[2]);
        float dep=Float.parseFloat(hello[3]);
        float with=Float.parseFloat(hello[4]);
        member.insert(acc1,hello[1],amt);
        member.deposit(dep);
        member.checkbalance();
        member.withdraw(with);
        member.display();
        

    }
}
