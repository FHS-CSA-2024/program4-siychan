//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;
public class Program4
{
    public static void main(String[] args)
    {
        Scanner numbers = new Scanner(System.in);
        System.out.print("Input first 3 digit number: ");
        int num1 = numbers.nextInt();
        System.out.print("Input second 3 digit number: ");
        int num2 = numbers.nextInt();
        System.out.print("Input third 3 digit number: ");
        int num3 = numbers.nextInt();
        System.out.print("Input fourth 3 digit number: ");
        int num4 = numbers.nextInt();
        int sum = num1 + num2 + num3 + num4;
        double average = sum / 4.0;
        System.out.println("");
        System.out.println("The sum of the four numbers is " + sum + "\n");
        System.out.println("The average of the four numbers is " + average);
    }
}


//Paste console output below:
/*
Input first 3 digit number: 475
Input second 3 digit number: 821
Input third 3 digit number: 369
Input fourth 3 digit number: 562

The sum of the four numbers is 2227

The average of the four numbers is 556.75
*/
