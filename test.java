class Simple
{
    public void add(int a , int b)
    {

        int c;
        c= a+b;
        System.out.println("Additin of 2 no", c);
    }
    public static void main(String args[])
    {
        Simple s1 = new Simple ();
        s1.add(10,20);
        s1.add(18,20);
        System.out.println("my test");
    }

}