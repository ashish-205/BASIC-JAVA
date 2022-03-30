class Account{
	int account;
	String name;
	float amount;
	
	void setdetails(int account,String name,float amount)
	{
		this.account=account;
		this.name=name;
		this.amount=amount;
	}
	
	void display()
	{
		System.out.println("Name is "+name);
			System.out.println("Account number is "+account);
				System.out.println("Amount is "+amount);
	}
	
	public static void main(String args[])
	{
		Account s1=new Account();
		
		s1.setdetails(547101,"Ashish",15000);
		
		s1.display();
		
		}
		
}class Account{
	int account;
	String name;
	float amount;
	
	void setdetails(int account,String name,float amount)
	{
		this.account=account;
		this.name=name;
		this.amount=amount;
	}
	
	void display()
	{
		System.out.println("Name is "+name);
			System.out.println("Account number is "+account);
				System.out.println("Amount is "+amount);
	}
	
	public static void main(String args[])
	{
		Account s1=new Account();
		
		s1.setdetails(547101,"Ashish",15000);
		
		s1.display();
		
		}
		
}
