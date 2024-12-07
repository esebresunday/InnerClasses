//Method local inner class
public class Inner3
{
    public static void main(String[] args)
    {
       Outer1 o1 = new Outer1();
       o1.method();
    }
}
class Outer1
{
    public void method()
    {
        System.out.println("Outer1 method");
        class Inner1
        {
            public int sum(int a, int b)
            {
                return a + b;
            }
        }
        Inner1 i1 = new Inner1();
        System.out.printf("the sum of %d and %d is %d",2,3,i1.sum(2,3));
    }
}
