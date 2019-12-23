import java.io.*;
import java.util.*;
class Box
{
int width,height;
double depth;
void setWidth(int width)
{
this.width=width;

}
void setHeight(int height)
{
this.height=height;

}
void setDepth(double depth)
{
this.depth=depth;

}
void Result(){
System.out.println("Width is "+width);
System.out.println("height is"+height);
System.out.println("depth is"+depth);

}
public static void main(String args[])
{
Box b1=new Box();

b1.setWidth(1);
b1.setDepth(2.0);
b1.setHeight(1);
b1.Result();
}
}

