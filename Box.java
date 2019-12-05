import java.io.*;
import java.util.*;
class B
{
double width,height,depth;
public void initialize(double w, double h, double d)
{
width=w;
height=h;
depth=d;
}
public double volume()
{
double v;
v=width*height*depth;
System.out.println(v);
return v;
}
}
class Box
{
public static void main(String args[])
{
B box = new B();
Scanner sc = new Scanner(System.in);
double w,x,y;
System.out.println("enter width, height, depth:");
w=sc.nextDouble();
x=sc.nextDouble();
y=sc.nextDouble();
box.initialize(w,x,y);
double z;
z=box.volume();
}
}