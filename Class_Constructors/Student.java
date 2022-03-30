import java.util.* ;
//as we know the university name would be same for all students so we made it static for memory management
class Student{
	String name;
	int roll_no;
	 static String University;
	String Branch;
	
	
	void set(String iname,int roll,String univ,String branch)
	{
		name=iname;
		roll_no=roll;
		University=univ;
		Branch=branch;
		
	}
	
	void get()
	{
		System.out.println("Name is "+name);
		System.out.println("Roll number is "+roll_no);
		System.out.println("University name is "+University);
		System.out.println("Branch is "+Branch);
		
	}
	
	public static void main(String args[])
	{
		Student s1=new Student();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name ");
		String name=sc.nextLine();
		
		
		
		//sc.nextLine();
		System.out.println("Enter your University ");
		String univ1=sc.nextLine();
		
		
		
		System.out.println("Enter your Branch ");
		String branch=sc.nextLine();
		
		System.out.println("Enter your roll number ");
		int roll=sc.nextInt();
		s1.set(name,roll,univ1,branch);
		s1.get();
	}
}
