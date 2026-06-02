import java.util.*;
class MTable
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("enter the number");
        n=sc.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(i+"x"+n+"="+i*n);
        }
         sc.close();
        
    }
}
