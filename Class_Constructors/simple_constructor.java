import java.util.* ;

class Xyz{
    
    String name;
    int roll_no ;

    Xyz(String iname,int roll)
    {
        name=iname;
        roll_no =roll;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        int roll=sc.nextInt();

        Xyz d=new Xyz(name,roll);         //constructor calling

        System.out.println(d.name );
        System.out.println(d.roll_no );
    }
}
