import java.util.Scanner;
public class Practical6
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No.:");
        int no = input.nextInt();
        int sum=0;
        while(no > 0)
        {
            sum = sum+ no%10;
            no = no/10;
        }
        System.out.println("Sum of digit = "+sum);
        input.close();
    }
}