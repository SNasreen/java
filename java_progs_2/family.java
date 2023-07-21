class grandfather
{
void root()
{
int a=1000;
System.out.println(a);
}
}
class  son extends grandfather
{
void root1()
{
int b=2000;
System.out.println(b);
}
}
class daught extends grandfather
{
void root2()
{
int c=2500;
System.out.println(c);
}}
class son_in extends daught
{
void root3()
{
int d=3000;
System.out.println(d);
}}
class daught_in extends grandfather
{
void root4()
{
int e=3500;
System.out.println(e);
}
}
class grnd_son extends grandfather
{
void root5()
{
System.out.println("Fees of son:");
int a=4000;
System.out.println(a);
}
}
class grnd_daught extends grandfather
{
void root6()
{
System.out.println("Fees of daughter:");
int b=5000;
System.out.println(b);
}
}
class age extends grandfather
{
void root7
{
System.out.println("Age of 
class family
{
public static void main(String args[])
{
son a=new son();
daught b=new daught();
son_in c=new son_in();
daught_in d=new daught_in();
grnd_son e=new grnd_son();
grnd_daught f=new grnd_daught();
a.root();
a.root1();
b.root2();
c.root3();
c.root4();
e.root5();
f.root6();
}
}

