#JavaProject1.java

import java.util.*;
class nogame
{
    static void main( int t)
    {   
        Scanner sc=new Scanner(System.in);
        /*int m=100;int s=0;
        int n=1;int a=0;
        int r=m-n+1;*/
        Random random=new Random();
        int a= random.nextInt(100)+1;
        //System.out.println("random no:"+a);
        /*for(int i=0;i<=100;i++)
        {
          if(a<=i)
          System.out.println("random no:"+a);
        }*/
        int b=a;int f=0,g=0,h=0;
         for(int j=1;j<=t;j++)
         {
             System.out.println("enter the guessed no");
             int s=sc.nextInt();
             
           if(a==s)
           {
             System.out.println("guessed no is correct");
             f++;
            }
          else if(s%2>a)
          {
           System.out.println("guessed no is too high");
           g++;
          }
          else if(s%2<a)
          {
           System.out.println("guessed no is low");
           h++;
          }
          System.out.println("no of right:"+ f);
          System.out.println("no of guessed no is high:"+g);
          System.out.println("no of guessed no is low:"+h);
          s=0;
         }
         System.out.println("random no:"+a);
        }
        
    }
