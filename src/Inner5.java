//defining a static nested inner class
public class Inner5
{
    public static void main(String[] args)
    {
        Outer2.Inner i = new Outer2.Inner();
        i.m();
    }
}

class Outer2
{
    static class Inner
    {
        public void m()
        {
            System.out.println("This is the static inner class method");
        }
    }
}