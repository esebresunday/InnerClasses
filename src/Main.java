class Main
{
    public static void main(String[] args)
    {
        Main o = new Main();
        Main.Inner i = o.new Inner();
        i.m();
        o.m2();

    }
    class Inner
    {
        public void m()
        {
            //static int x = 0;
            System.out.println("This is the inner method");
        }
    }
    public void m2()
    {
        Inner j = new Inner();
        System.out.println("This is the m2 method");
        j.m();
    }
}