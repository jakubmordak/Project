/*
Exercise 3:
Given an array of ints, print to console true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
Example:
int[] array = {3,2,14,1,2,3,6};
should print true
*/
import java.util.Scanner;
public class ex3
{
    public static final int N=10;
   public static void main(String args[])
   {

       int[] array= new int[N];
       Scanner s=new Scanner(System.in);
       for(int i=0;i<N;i++)
       {
           System.out.println("Type number");
           array[i]=s.nextInt();
       }
       for (int i=0;i<N-2;i++)
           if(array[i]==1)
               if(array[i+1]==2)
                   if(array[i+2]==3)
                   {
                       System.out.println("True");
                        break;
                   }

   }
}
