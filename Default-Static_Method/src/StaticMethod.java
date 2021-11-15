interface Static
{
    // abstract method
    public void product(int a,int b);
  
    // static method
    static void show()
    {
      System.out.println("Static Method Executed");
    }
}
  
class StaticMethod implements Static
{
    // implementation of  abstract method add
    public void product(int a,int b)
    {
        System.out.println(a*b);
    }
  
    public static void main(String args[])
    {
    	StaticMethod s = new StaticMethod();
        s.product(4,5);
  
        // static method executed
        Static.show();
    }
}



