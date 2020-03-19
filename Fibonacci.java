class Fibonacci{
 public static void main(String args[])
 {
 int  n1=1, n2=1 ,sum=0;
 System.out.print("1 1 ");
 while(sum<=30)
  {
   sum=n1+n2;
   System.out.print(sum + " ");
   n1=n2;
   n2=sum;
  }
}
}
 
  