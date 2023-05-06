class ass12
{
 public static void main(String args[])
 {
  int a[][]={{1,2},{3,4},{5,6}};
  double sum1,sum2,sum=0,avg1,avg2;
  for(int i=0; i<3; i++)
  {
   sum1=0;
   for(int j=0; j<2; j++)
   {
    sum1=sum1+a[i][j];
   }
   System.out.println("The row wise average is \n"+sum1/2.0);
  }
  
 for(int i=0; i<2; i++)
  {
   sum2=0;
   for(int j=0; j<3; j++)
   {
    sum2=sum2+a[j][i];
   }
   System.out.println("The column wise average is \n"+sum2/3.0);
  }
  
 for(int i=0; i<3; i++)
  {
   for(int j=0; j<2; j++)
   {
    sum=sum+a[i][j];
   }
  }
   System.out.println("The grand average is \n"+sum/6.0);
 }
}