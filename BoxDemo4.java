class Box
{
double width,height,depth;
double Volume()
{
return width*height*depth;
}
}
class BoxDemo4
{
public static void main(String[] args)
{
Box obj1=new Box();
double vol;
obj1.height=12;
obj1.width=24;
obj1.depth=10;
vol=obj1.Volume();
System.out.println("Volume of the box: "+vol);
}
}
