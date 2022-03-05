// Create a class using hardcoded values which have states as account number,name,amount and behaviours include insert,deposit,checkbalance,display
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

    public static void main(String agrs[])
    {
        Account member=new Account();
        member.insert(1253,"Ashish",1000);
        member.deposit(1000);
        member.checkbalance();
        member.withdraw(500);
        member.display();
        member.withdraw(2000);

    }
}
