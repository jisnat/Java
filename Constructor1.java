class Employee
{
int eco;
String eName;
Employee()
{
eco=12;
eName="jisna";
}
void show()
{
System.out.println("\nEmployee no: "+eco+ "\nEmployee name:" +eName);
}
}
class Constructor1
{
public static void main(String[] args)
{
Employee obj1=new Employee();
obj1.show();
}
}
