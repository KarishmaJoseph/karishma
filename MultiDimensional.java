import java.util.*;
class MultiDimensional{
  public static void main(String args[])
   {
    Random r=new Random();
    int arr[][][]=new int[4][4][4];
     for(int i=0;i<4;i++)
     {
      for(int j=0;j<4;j++)
      {
       for(int k=0;k<4;k++)
       {
       arr[i][j][k]=r.nextInt(10);
       }
       }
      }
      for(int i=0;i<4;i++)
     {
      for(int j=0;j<4;j++)
      {
       for(int k=0;k<4;k++)
       {
       System.out.print(" "+arr[i][j][k]);
       }
       }
    }
   }
}
       