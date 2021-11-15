
interface Default
{
    // abstract method
    public void add(int a,int b);
  
    // default method
    default void show()
    {
      System.out.println("Default Method Executed");
    }
}
  
class DefaultMethod implements Default
{
    // implementation of  abstract method add
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
  
    public static void main(String args[])
    {
    	DefaultMethod d = new DefaultMethod();
        d.add(4,5);
  
        // default method executed
        d.show();
    }
}

