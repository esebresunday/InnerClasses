//defining nested inner classes
public class Inner2
{
    public static void main(String[] args)
    {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        c.m();

    }
}
class A
{
    class B
    {
        class C
        {
            public void m()
            {
                System.out.println("This is the inner inner class");
            }
        }
    }
}
