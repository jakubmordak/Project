/*Exercise 1:
We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 2 int values, print to console true if one or the other is teen, but not both.
Example:
int a = 1;
int b = 13;
if a or b is "teen" print "teen" */

import java.util.Scanner;
public class ex1 {
public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int a;
    int b;
    System.out.println("Insert first number");
    a=s.nextInt();
    System.out.println("Insert second number");
    b=s.nextInt();
    if (a>=13 & a<=19 & b<13 | b>19)
    {
        System.out.println("teen");
    }
    if (b>=13 & b<=19 & a<13 | a>19)
    {
        System.out.println("teen");
    }

}

}
