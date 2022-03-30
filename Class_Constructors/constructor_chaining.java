import java.util.* ;
//constructor chaining helps in reusability of the constructor and themethod can only work if the first statement of a constructor is a this( ) . 
class Xyz
{
    static int w,x,y,z;    
    Xyz(int a,int b)
    {
      
        w=a;
        x=b;
    }
    Xyz(int a,int b,int c)
    {
       
        this(a,b);
        y=c;
      
    }
    Xyz(int a,int b,int c,int d)
    {
        
        this(a,b,c);                    
        z=d;
       
    }
    public static void main(String args[])
    {
       Xyz d=new Xyz(3,45,5,78);
      System.out.println("Value of w is "+w);
      System.out.println("Value of x is "+x);
      System.out.println("Value of y is "+y);
      System.out.println("Value of z is "+z);
    }
}
