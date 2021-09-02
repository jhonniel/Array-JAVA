import java.util.Scanner;
public class Array {
	
	  public static void main(String args[])
		
	     {
		
	          int n;double res=0;
	          int max;
		
		  Scanner sc=new Scanner(System.in);
	 
		  System.out.println("Enter no. of elements you want in array:");
		   
	          n=sc.nextInt();
	 
		  int a[]=new int[n];
	 
		  System.out.println("Enter   "+n+"  numbers");
	    	       
	          for(int i=0;i<n;i++)
	          {
	 	       a[i]=sc.nextInt();
	          }
	          max = a[0];
	          for(int i = 0; i < n; i++)
	          {
	              if(max < a[i])
	              {
	                  max = a[i];
	              }
	          }
	          
		  res=Array.CalAvg(a,n); 
	 	 	    
	  	  System.out.println("Average is:"+res/n);
	  	  System.out.println("Highest Number:"+max);
	  	System.out.print("Odd Numbers:");
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 != 0)
            {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println("");
        System.out.print("Even Numbers:");
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.print(a[i]+" ");
            }
        }
	 
	     }
		
	       static double CalAvg(int  a[],int n)
	       {
		   double res=0;
	 
		   for(int i=0;i<n;i++)
		       res =res+a[i];
	 
		   return res;
	        }
	}
