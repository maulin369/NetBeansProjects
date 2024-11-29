
package practiceswitch;

import java.util.Scanner;

public class PracticeSwitch {

    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Menu");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
         
        System.out.println("Enter 2 No. : ");
       
        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Option In Words ");
        String option=sc.nextLine();
        option=option.toUpperCase();
        
        switch(option)
        {
            case "ADD": System.out.println("Sum is "+(x+y));
            break;
            case "SUB": System.out.println("Deffance is "+(x-y));
            break;
            case "MUL": System.out.println("Product is "+(x*y));
            break;
            case "DIV": System.out.println("Ratio is "+(x/y));
            break;
            default: System.out.println("Invalid Option");
            break;
        }
        
        
        
        
        
        
        
        
        
        /* // Display type of website
        Scanner sc=new Scanner(System.in);
               
        System.out.println("Enter Domain Name : ");
        String domain=sc.nextLine();
        
        String ext=domain.substring(domain.lastIndexOf(".")+1);
        switch(ext)
        {
            case "com":System.out.println("Commercial");
            break;
            case "org":System.out.println("Organiztion");
            break;
            case "net":System.out.println("Network");
            break;
            case "gov":System.out.println("Government");
            break;
        }
        */
        
        
        
        
        
        
        /* // Display name of month based on number 
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a Month Number :");
        int month=sc.nextInt();
        
        switch(month)
        {
            case 1:System.out.println("Jan");
            break;
            case 2:System.out.println("Fab");
            break;
            case 3:System.out.println("Mar");
            break;
            case 4:System.out.println("Apr");
            break;
            case 5:System.out.println("May");
            break;
            case 6:System.out.println("Jun");
            break;
            case 7:System.out.println("Jul");
            break;
            case 8:System.out.println("Aug");
            break;
            case 9:System.out.println("Sap");
            break;
            case 10:System.out.println("Oct");
            break;
            case 11:System.out.println("Nov");
            break;
            case 12:System.out.println("Dec");
            break;
            default:System.out.println("Invalid Month");
            break;
        }
        */
        
        
        
        /* 
        // Display name of day based on number
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Day Number :");
        int day=sc.nextInt();
        
        switch(day)
        {
            case 1:System.out.println("Monday");
            break;
            case 2:System.out.println("Tuesday");
            break;
            case 3:System.out.println("Wensday");
            break;
            case 4:System.out.println("Thusday");
            break;
            case 5:System.out.println("Friday");
            break;
            case 6:System.out.println("Saturday");
            break;
            case 7:System.out.println("Sunday");
            break;
            default :System.out.println("Invalid Day");
            break;
        }
        */
        
    }
    
}
