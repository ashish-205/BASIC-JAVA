import java.util.* ;

class Xyz{
    
    String name;
    int roll_no ;

    Xyz()
    {
        name="ashish" ;
        roll_no =152365 ;
    }
    public static void main(String args[])
    {
       
        Xyz d=new Xyz();         //constructor calling by default

        System.out.println(d.name );
        System.out.println(d.roll_no );
    }
}
