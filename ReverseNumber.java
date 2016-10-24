import java.io.*;
class ReverseNumber
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
int number,rev=0,rem=0;
number=Integer.parseInt(in.readLine());
while(number>0)
{
rem=number%10;
rev=rev*10+rem;
number=number/10;
}
System.out.println("Reversed number:"+rev);
}
catch(Exception e)
{
}
}
}
