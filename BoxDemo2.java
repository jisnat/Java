class Box
{
double width;
double height;
double depth;
}
class BoxDemo2
{
public static void main(String[] args)
{
Box obj1=new Box();
Box obj2=new Box();

obj1.width=2;
obj1.height=4;
obj1.depth=6;

obj2.width=1;
obj2.height=3;
obj2.depth=5;

double volume1=obj1.width*obj1.height*obj1.depth;
double volume2=obj2.width*obj2.height*obj2.depth;

System.out.println("Volume of first box is "+volume1);
System.out.println("Volume of second box is "+volume2);
}
}

