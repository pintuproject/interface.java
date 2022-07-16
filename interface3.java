 interface a{
  void run();
}
interface b{
  void show();
}
class c implements a,b{
void run()
{
System.out.println("a interface method");
}
void show()
{
System.out.println(" b interface method");
}
public static void main(String args[])
{
c ob=new c();
ob.run();
ob.show();
}

}
// can not run beacuse a class can not implements two interface simultaneously.