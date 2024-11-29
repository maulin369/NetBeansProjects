
package nestedloops;

public class NestedLoops {
               //patterns1
    public static void main(String[] args) 
    {   
        for(int i=1;i<=5;i++)
            {
                for(int j=1;j<=5;j++)
                {
                    for(int k=1;k<=5;k++)
                    {
                        if(i-j+k>=5)
                        System.out.print("* ");
                        else
                        System.out.print("  ");
                    }
                    
                }
                System.out.println("");
            }
        
        
        
        
        
        /*
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i<=j)     //if(j>=i)
                    System.out.print(("* "));
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
        */
        
        
        
        
        
        /*
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i+1;j++)
            {
                System.out.print(i+" "); 
              //System.out.print(j+" ");
              //System.out.print("* ");
            }
            System.out.println("");
        }
        */
        
        
        
        
        /*
        int count=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                count++;
                System.out.print(count+" ");
            }
            System.out.println(" ");
        }
        */
        
        
        
        
        /*
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
        */
        
        
        
        /*
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        */
               
        
        /*
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print("("+i+","+j+")");
            }
            System.out.println("");
        }
        */
        
        
        
        
        
    }
    
}
