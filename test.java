class Nain
{
String s="Nainsi";
}
class C extends Nain
{
String s="Shweta";
void m1()
{
System.out.println(s);
System.out.println(super.s);
System.out.println(this.s);
}
}
class D extends Nain
{
String s="Sh";
void m1()
{
System.out.println(s);
System.out.println(super.s);
System.out.println(this.s);
}
}
class test
{
public static void main(String agrs[])
{
D c=new D();
c.m1();
}
}