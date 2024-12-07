//accessing inner class code from outside of outer class
//accessing both static and non-static member of the outer class from a non-static method of an inner class
class InnerClass1
{
    public static void main(String[] args)
    {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        System.out.println(i.x);
        System.out.println(o.y);
        i.m();
    }
}
class Outer
{
    String name = "Outer";
    String j = "david";
    static int y = 3;
    class Inner
    {
        String name = "Inner";
        int x = 8;
        public void m()
        {
            System.out.println(this.name);
            System.out.println(Outer.this.name);
            System.out.println(y);
            System.out.println(j);
        }
    }
}