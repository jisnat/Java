class Box
{
double width,height,depth;
void volume()
{
System.out.println("Volume = "+width*height*depth);
}
}
class BoxDemo3
{
public static void main(String[] args)
{
Box obj1=new Box();
Box obj2=new Box();

obj1.height=3;
obj1.width=4;
obj1.depth=5;
obj1.volume();

obj2.width=2;
obj2.height=7;
obj2.depth=8;
obj2.volume();
}
}
