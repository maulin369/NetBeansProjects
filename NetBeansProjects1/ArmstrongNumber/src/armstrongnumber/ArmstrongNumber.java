
package armstrongnumber;

import java.util.*;
public class ArmstrongNumber {

    public static void main(String[] args) 
    {  
        // Display a number in words even with tailing 0
         Scanner sc=new Scanner(System.in);
            
        System.out.println("Enter a Number ");
        int n=sc.nextInt();
        
        int r;
        String str="";
        
        while(n>0)
        {
            r=n%10;
            n=n/10;
            str=str+r;
        }
        System.out.println(str);
         
        char c;
        for(int i=str.length()-1;i>=0;i--)
        {
            c=str.charAt(i);
            switch(c)
            {
                case '0':System.out.println("Zero ");
                break;
                case '1':System.out.println("One ");
                break;
                case '2':System.out.println("Two ");
                break;
                case '3':System.out.println("Three ");
                break;
                case '4':System.out.println("Four ");
                break;
                case '5':System.out.println("Five ");
                break;
                case '6':System.out.println("Six ");
                break;
                case '7':System.out.println("Seven ");
                break;
                case '8':System.out.println("Eight ");
                break;
                case '9':System.out.println("Nine ");
                break;
                    
             }
         }
       
        
        
        
        
        
        /*
        // 5. Cheak a number is palindrome
        
        Scanner sc=new Scanner(System.in);
            
        System.out.println("Enter a Number ");
        int n=sc.nextInt();
      
        int rev=0,r;
        int m=n;
        
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        } 
        if (rev==m)
        System.out.println("Its a Palindrome Number ");
        else
            System.out.println("Its Not a Palindrome Number ");
        */
        
       
        
        /*
        // 4. Reverse a Number
        Scanner sc=new Scanner(System.in);
            
        System.out.println("Enter a Number ");
        int n=sc.nextInt();
        
        int rev=0;
        int r;
        
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Reverse Number "+rev);
        */
        
        
        
        
        
        
        /* 
        // 3. Finding a number is Armstrong or not
        Scanner sc=new Scanner(System.in);
            
        System.out.println("Enter a Number ");
        int n=sc.nextInt();
        
        int m=n;
        int sum=0;
        int r;
              
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        if(sum==m)
            System.out.println("Its a Armstrong Number ");
        else
            System.out.println("Is Not a  Armstrong Number ");
        */
        
        
        
        
        
        /* 2. Count Digits on Number
        Scanner sc=new Scanner(System.in);
            
        System.out.println("Enter a Number ");
        int n=sc.nextInt();
        
        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
            
        } 
            System.out.println(count);
        }
        */
        
        

        /*
        // 1. Dispaly Digits of Number
        Scanner sc=new Scanner(System.in);
            
        System.out.println("Enter a Number ");
        int n=sc.nextInt();
        
        int r;
        
        while(n>0)
        {
            r=n%10;
            n=n/10;
            System.out.println(r);
        }
        */

    }
    
}
