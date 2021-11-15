
interface Interface1
{
    default void show()
    {
        System.out.println("Default Interface1");
    }
}
  
interface Interface2
{
    default void show()
    {
        System.out.println("Default Interface2");
    }
}
  
class MultipleInhert implements Interface1, Interface2
{
    // Overriding default show method
    public void show()
    {
        Interface1.super.show();
        Interface2.super.show();
    }
  
    public static void main(String args[])
    {
    	MultipleInhert mi = new MultipleInhert();
        mi.show();
    }
}