interface ZeroPara
{
    //abstract method of 0 parameter
    void zeroPara();
}
interface OnePara
{
    //abstract method of 1 parameter
    void onePara(String name);
}
interface MultiPara
{
    //abstract method of multiple parameter
    void multiPara(int a, int b);
}
class NumberOfParameter
{
    public static void main(String args[])
    {
     int num=10;
     //lambda exp for 0 parameter
     ZeroPara df=()->System.out.println(num); 
     df.zeroPara();
     //lambda exp for 1 parameter
     OnePara op=(name)->System.out.println(name); 
     op.onePara("Deepti");
   //lambda exp for more than 1 parameter with multiple statement
     MultiPara mp=(int a, int b)->{int add=a+b;
     								System.out.println(add);
     								} ;
     mp.multiPara(5,8);
     
    }
}
