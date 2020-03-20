import java.util.*;
class Array2
  {
    public static void main(String args[])
     { 
     Random r=new Random();
     int arr[]=new int[30];
     for(int i=0;i<arr.length;i++)
     {
      arr[i]=r.nextInt(50);
     }
    try
    {
     System.out.println(arr[32]);
    }
    catch(Exception e)
    {
    System.out.println("Maximum index value is : 49");
    }
     for(int i:arr){
     System.out.print(i+" ");
     }
    }
   }
