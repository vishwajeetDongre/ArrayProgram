package org.Array;
import java.util.*;
public class RemoveDuplicate
{
public static void main(String x[])
{ int i,j,k,c=0;
Scanner xyz=new Scanner(System.in);
int a[]=new int[7];
int b[]=new int[7];
System.out.println("enter the array value");
for(i=0;i<a.length;i++)
{


  a[i]=xyz.nextInt();
 
  }
System.out.println("sorting ");
for(i=0;i<a.length;i++)
{
for(j=(i+1);j<a.length;j++)
{

if(a[i]>a[j])
{
   int temp=a[i];
  a[i]=a[j];
   a[j]=temp;
}
}
}
for(i=0;i<a.length;i++)
{
System.out.printf("%d\t",a[i]);
}
System.out.println("\nremove duplicate array");

        for(i=0;i<a.length;i++)
             {  
                if(i<a.length-1)
                   { 
                     if(a[i]!=a[i+1])
                        {  
                            b[c]=a[i];
                            c++;
                        }
                  }
                else
                     { 
                        if(a[i]==a[i])
                           {  
                              b[c]=a[i];
                              c++;
                            }
                     }

                 }

System.out.printf("c =%d\n",c);
for(i=0;i<c;i++)
{
System.out.printf("%d\t",b[i]);
}
}
}

