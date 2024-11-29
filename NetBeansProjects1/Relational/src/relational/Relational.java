
package relational;

import java.util.Scanner;

public class Relational {

    public static void main(String[] args) {
        
         
        /*
        // Q. find type of website and the protocol used
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter a URL ");
        String url=scan.nextLine();
        
        String protocol=url.substring(0, url.indexOf(":"));
        
        if(protocol.equals("http"))
            System.out.println("Hypertext Transfer Protocol");
        else if(protocol.equals("ftp"))
            System.out.println("File Transfer Protocol");
        
        String ext=url.substring(url.lastIndexOf(".")+1);
        
        if(ext.equals("com"))
            System.out.println("Commercial");
        else if(ext.equals("org"))
            System.out.println("Organisation");
        else if(ext.equals("net"))
            System.out.println("Network");
        */
        
        
        
        /* Display day of the number
        System.out.println("Enter a Day Number");
        int day=sc.nextInt();
        
       if(day==1)
       {
           System.out.println("Day is Monday");
       }
       else if(day==2)
       {
           System.out.println("Day is Tuesday");
       }
       else if(day==3)
       {
           System.out.println("Day is Wensday");
       }
       else if(day==4)
       {
           System.out.println("Day is Thuesday");
       }
       else if(day==5)
       {
           System.out.println("Day is Friday");
       }
       else if(day==6)
       {
           System.out.println("Day is Saturday");
       }
       else if(day==7)
       {
           System.out.println("Day is Sunday");
       }
       else
       {
           System.out.println("Invalid Day Number");
       }
       */
        
      
        
        
        
        
        
        /*
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a Year Number");
        int year=sc.nextInt();
        
        if (year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("Its a Leap Year");
                }
                else
                    System.out.println("Not a Leap Year");
                
            }
            else
            {
                System.out.println("Its a Leap Year");
            }
        }
        else
        {
            System.out.println("Its a Leap Year");
        }
        */    
        
        
            
        
        
        /* Radix of number given in string 
        
        Scanner sc=new Scanner(System.in);
        
        String num;
        
        System.out.println("Enter a Number");
        num=sc.nextLine();
        
        if(num.matches("[01]+"))
        {
            System.out.println("Binary Radix=2");
        }
        else if(num.matches("[0-7]+"))
        {
            System.out.println("Octal Radix=8");
        }
        else if(num.matches("[0-9]+"))
        {
            System.out.println("Decimal Radix=8");
        }
        else if(num.matches("[0-9A-F]+"))
        {
            System.out.println("Hexa Radix=8");
        }
        */
        
        
        
        /*
        int m1,m2,m3;
        
        Scanner sc=new Scanner(System.in);
                
        System.out.println("Enter Marks Of 3 Subjects ");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        
        float avg=(float)(m1+m2+m3)/3;
        
        if (avg>=70)
        {
            System.out.println("A Gread");
        }
        else if (avg>=60 && avg<70)
        {
            System.out.println("B Gread");
        }
        else if (avg>=50 && avg<60)
        {
            System.out.println("C Gread");
        }
        else if (avg>=40  && avg<50)
        {
            System.out.println("D Gread");
        }
        else 
        {
            System.out.println("F Gread");
        }
        */
          
        
        
        /* Young or Not
        int age;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Your Age ");
        age=sc.nextInt();
        
        if (age>=14 && age<55) 
         
        {
            System.out.println("You Are Young");
        }
        else if (age<14 || age>55)
        {
            System.out.println("You Are Not Young");
        }
        */
        
        
        
        
        
        /* Even or Odd Number 
        int n;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a number ");
        n=sc.nextInt();
        if (n%2==0)
            
        {
            System.out.println("It is a Even Number");
        }
        else
        {    
            System.out.println("It is a Odd Number");
        }
        */
        
        
        /*
        int a=5;
        if (a>=0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        } 
        */
        
        
         
        /* 
        int a=10,b=25,c=20;
        if(a>b || b<c)
        {
            System.out.println(a);
        }
        else if (b<c)
        {
            System.out.println(b);
        } else
        {
            System.out.println(c);
        } */
       
    }
    
}
