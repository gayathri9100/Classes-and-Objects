import java.io.*;
import java.util.*;
class Patient
{
String name;
double weight;
double height;
Patient(String n,double w,double h)
{
name=n;
weight=w;
height=h;
}
public double BMI()
{
double z;
z = (weight/(height*height))*703;
return z;
}
}
class Patients
{
public static void main(String args[])
{
System.out.println("enter values:");
String s;
double we,he;
Scanner sc = new Scanner(System.in);
s=sc.next();
we=sc.nextDouble();
he=sc.nextDouble();
Patient pa = new Patient(s,we,he);
double f;
f=pa.BMI();
System.out.println("BMI:"+f);
}
}