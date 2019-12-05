import java.io.*;
import java.util.*;
import java.lang.*;
class Calculator
{
static double powerInt(int num1,int num2)
{
double x;
x=Math.pow(num1,num2);
return x;
}
static double powerDouble(double num1,int num2)
{
double y;
y=Math.pow(num1,num2);
return y;
}
}
class Calci
{
public static void main(String args[])
{
double a,b;
a=Calculator.powerInt(2,3);
b=Calculator.powerDouble(2.0,3);
System.out.println("powerInt:"+a);
System.out.println("powerDouble:"+b);
}
}
