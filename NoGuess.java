import java.util.Random;
import java.util.*;
class NoGuess
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int num=rand.nextInt(100)+1;
        while(true)
        {
             System.out.println("guess number");
             int g=sc.nextInt();
             if(g==num)
             {
                 System.out.println("the guess is correct");
                 break;
             }
             else if(g<num)
             {
                 System.out.println("less than number.try again");
                 continue;
             }
             else 
             {
                 System.out.println("greater than number.try again");
                 continue;
             }
             
        }
        System.out.println("random no is"+ num);
        
        
        
       
         
         
    }
}
        
