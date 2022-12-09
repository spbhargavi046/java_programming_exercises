import java.lang.Math;

class Number{
private double num;
Number(double x)
{
num=x;
}
boolean isZero()
{
if(num==0)
  return true;
else
  return false;
}

boolean isPositive()
{
if(num >= 0)
  return true;
else 
  return false;
}

boolean isNegative()
{
if(num < 0)
  return true;
else 
  return false;
}

boolean isOdd()
{
if(num%2 != 0)
  return true;
else 
  return false;
}

boolean isEven()
{
if(num%2 == 0)
  return true;
else
  return false;
}

boolean isPrime()
{
if(num == 2)
 return true;
else
{
for(int i=2;i<num;i++)
{
if(num%i == 0)
  return false;
}
return true;
}
}

boolean isArmstrong()
{
int n=(int)num;
int x=0;
int sum=0;
while(n!=0)
{
  x=n%10;
  sum=sum+(x*x*x);
  n=n/10;
}
if((int)num==sum)
 return true;
else
 return false;
}

double getFactorial()
{
if(num < 0)
{ System.out.println("Invalid-can't find factorial for negative number");
 return 0;
 }
else if(isZero())
 return 1;
else
{
int fact=1;
for(int i=1;i<=(int)num;i++)
{
 fact=fact*i;
}
return fact;
}
}

double getSqrt()
{
if(num<0){
 System.out.println("Invalid-can't find squareroot for negative number");
 return 0;
}
else if(isZero())
 return 0;
else
 return Math.sqrt(num);
}

double getSqr()
{
return num*num;
}

double sumDigits()
{
int n=(int)num;
int sum=0;
while(n>0)
{
 sum=sum+n%10;
 n=n/10;
}
return sum;
}

double getReverse()
{
int n=(int)num;
int res=0;
while(n!= 0)
{
 res=(res*10)+(n%10);
 n=n/10;
}
return res;
}


void listFactor()
{
System.out.println("Factors of "+num+" :");
for(int i=1;i<=(int)num;i++)
{
 if((int)num%i == 0)
 {
  System.out.println(i);
 }
}
}

void dispBinary()
{
int n=(int)num;
int bin=0;
while(n>0)
{
 bin=bin*10+bin%2;
 bin=bin/2;
}
n=bin;
int res=0;
while(n>0)
{
 res=res*10+n%10;
 n=n/10;
}

System.out.println("Binary form of "+num+" = "+res);
}
}

class assign1{
public static void main(String args[]){
Number n = new Number(15);
System.out.println("Is the input number zero ? "+n.isZero());
System.out.println("Is the input number positive ? "+n.isPositive());
System.out.println("Is the input number negative ? "+n.isNegative());
System.out.println("Is the input number odd ? "+n.isOdd());
System.out.println("Is the input number even ? "+n.isEven());
System.out.println("Is the input number prime ? "+n.isPrime());
System.out.println("Is the input number armstrong number ? "+n.isArmstrong());
System.out.println("Factorial of the input number = "+n.getFactorial());
System.out.println("Square root of the input number = "+n.getSqrt());
System.out.println("Square of the input number = "+n.getSqr());
System.out.println("Sum of digits of the input number = "+n.sumDigits());
System.out.println("Reverse of the input number = "+n.getReverse());
n.listFactor();
n.dispBinary();
}
}
