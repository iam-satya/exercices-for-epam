import java.util.*;
import java.io.*;
import java.lang.Math;

class Calculator
{
static int powerInt( int num1,int num2)
{
return Math.pow(num1,num2);
}
static int powerDouble( int num1,int num2)
{

return Math.pow(num1,num2);
}
}
class CalculatorMain
{
public static void main(String args[])
{
System.out.println("power1"+Calculator.powerInt(12,10));
System.out.println("power2"+Calculator.powerDouble(12,10));

}

}
