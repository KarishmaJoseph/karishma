import java.util.Scanner;
class Amstrong
{
  public static void main(String args[])
  {
  int n,c=0,a,temp;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a Number:");
  n=sc.nextInt();
  temp=n;
  while(n>0)
  {
  a =n%10;
  n=n/10;
  c=c+(a*a*a);
  }
  if(temp==c)
  System.out.println("Amstrong number");
  else
  System.out.println("Not Amstrong number");
  }
}