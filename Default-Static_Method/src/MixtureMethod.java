
interface Mixture
{
    // abstract method
    public void add(int a,int b);
  
    // default method
    default void product(int a, int b)
    {
      System.out.println("Product: "+a*b);
    }
    static void subtraction(int a, int b)
    {
    	int dif=a-b;
      System.out.println("Difference: "+dif);
    }
}
  
class MixtureMethod implements Mixture{
    // implementation of  abstract method add
    public void add(int a,int b)
    {
    	int add=a+b;
        System.out.println("addition: "+add);
    }
  
    public static void main(String args[])
    {
    	MixtureMethod m = new MixtureMethod();
        m.add(8,5);
  
        // default method executed
        m.product(5,7);
        // static method executed
        Mixture.subtraction(15,6);
    }
}
