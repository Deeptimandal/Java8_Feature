interface Interface
{
    // An abstract function
    void abstractFun(int x);
  
    // Default function
    default void normalFun()
    {
       System.out.println("Deafult Function");
    }
}
  
class Sample
{
    public static void main(String args[])
    {
        // lambda expression to implement above
        Interface obj = (int x)->System.out.println("The number is :" +x);
  
        // calling lambda expression and prints 10.
        obj.abstractFun(5);
        obj.normalFun();
    }
}
