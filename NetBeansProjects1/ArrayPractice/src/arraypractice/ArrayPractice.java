
package arraypractice;

import java.util.*;

public class ArrayPractice {

    public static void main(String[] args) 
    {
        //Q3. Finding Second Largest Element
        
        int A[]={3,9,7,8,12,6,15,5,4,10};
        
        int max1,max2;
        max1=max2=A[0];
        
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a Key ");
        // max1=sc.nextInt();
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max1) 
            {
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2) 
            {
                max2=A[i];
            }
        }
        System.out.println("Large is : "+max1);
        System.out.println("Second Large is : "+max2);
        
               
        
        
        /* //Q3. Finding Maximum Element
        Scanner sc=new Scanner(System.in);
        
        int A[]={3,9,7,8,12,6,15,5,4,10};
        
        int max=A[0];
        
        System.out.println("Enter a Key ");
        max=sc.nextInt();
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max) 
            {
                max=A[i];
            }
        }
        System.out.println("Max is : "+max);
        */
        
              
        
        
        
        /* //Q2. Searching an Element
        Scanner sc=new Scanner(System.in);
        
        int A[]={3,9,7,8,12,6,15,5,4,10};
        
        int key;
        System.out.println("Enter a Key ");
        key=sc.nextInt();
        
        for(int i=0;i<A.length;i++)
        {
            if(key==A[i]) //if(A[i]==key)
            {
                System.out.println("Element Found at : "+i);
                System.exit(0);
            }
        }
        System.out.println("Not Found ");
        */
        
        
        
        /* //Q1. Finding Sum of All Elements
        int A[]={3,9,7,8,12,6,15,5,4,10};
     
        int sum=0;      
        
        for(int i=0;i<A.length;i++) //for(int x:A)
        {
            sum=sum+A[i]; //sum=sum+x;
        }
        System.out.println("Sum is "+sum);
        */
        
        
        
        /* // First Example
        int A[]=new int[10];
        
        int B[]={1,2,3,4,5};
        
        int C[]=new int[10];
        
        B[2]=15;
        for(int x:B)
        {
            System.out.println(x++);
        }
        for(int x:B)
        {
            System.out.println(x);
        }
        */
        
        
    }
    
}
