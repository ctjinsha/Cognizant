import java.util.*;
class Calculator
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("1.addition 2.subtraction 3.multiplication 4.division");
         System.out.println("enter choice:");
         int ch=sc.nextInt();
         if(ch==1)
         {
             System.out.println(n1+n2);
         }
         else if(ch==2)
         {
             System.out.println(n1-n2);
         }
         else if(ch==3)
         {
             System.out.println(n1*n2);
         }
         else if(ch==4)
         {
             if(n2!=0){
             System.out.println(n1/n2);
         }
         else
         {
          System.out.println("error");   
         }
         }
         else
         {
             System.out.println("choose between 1 to 4");
         }
         sc.close();
        
    }
}
