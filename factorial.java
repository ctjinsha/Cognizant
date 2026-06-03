import java.util.*;
class Factorial
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number");
        int num=sc.nextInt();
        
        int fact=1;
        if(num<0)
        {
            System.out.print("invalid number");
        }
        else
        {
           for(int i=1;i<=num;i++)
           {
               fact=fact*i;
           }
          System.out.print("fatorial of "+num+" is "+fact);
        }
        
        
      
    }
}
