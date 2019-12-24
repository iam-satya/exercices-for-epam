import java.util.*;
import java.io.*;
class Patient
{
double height,weight;
String name;
public double BMI(double weight,double height)
{
return weight/(height*height);
}
public Patient(String name) {
      this.name = name;
   }
public void p11()
{
System.out.println("Name"+name);

}
}
class Patients
{
public static void main(String args[])
{
Patient p1=new Patient(" siva");
p1.p11();
System.out.println("Patients 1 bmi "+p1.BMI(162,60));

}
}