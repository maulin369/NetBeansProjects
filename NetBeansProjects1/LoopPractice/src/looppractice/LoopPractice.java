
package looppractice;

import java.util.*;

public class LoopPractice {

    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a Number ");
        int n=sc.nextInt();
        
        long fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial is "+fact);
        
        
        
        
        
        /*
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a Number ");
        int  n=sc.nextInt();
        
        int sum=0;
        
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of "+n+"  Number is "+sum);
        */
        
        
        
        
        
        
        /* - Display Multiplication Table
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+" = "+n*i);
        }
        */
        

        
       /*
        for(int i=0,j=1 ;i<=10; i++,j=j*2)
        {
            System.out.println(i+" "+j);
        }
        */
        
    }
    
}
