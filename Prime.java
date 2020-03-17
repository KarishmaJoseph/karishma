import java.util.Scanner;
class Prime
{
  public static void main(String args[])
  {
  int n;
  boolean flag=false;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a Number:");
  n=sc.nextInt();
   for(int i=2; i<=n/2;i++)
   {
     if(n%i==0)
     {
     flag=true;
     break;
     }
   }
  if(!flag)
   { 
   System.out.println("Prime Number");
   }
   else
   System.out.println("Not Prime Number");
  }
}
 
    