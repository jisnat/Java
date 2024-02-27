class Box
{
double width;
double height;
double depth;
}
class BoxDemo1
{
public static void main(String[] args)
{
Box obj=new Box();
obj.width=20;
obj.height=30;
obj.depth=10;
double volume=obj.width*obj.height*obj.depth;
System.out.println("Volume of the box is "+volume);
}
}
