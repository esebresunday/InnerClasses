// anonymous inner class
public class Inner4
{
    public static void main(String[] args)
    {
        Parent p = new Parent()
        {
            public void m()
            {
                System.out.println("Child method");
            }
        };
        p.m();
        Parent p2 = new Parent();
        p2.m();
    }
}
class Parent
{
    public void m()
    {
        System.out.println("Parent method");
    }
}
