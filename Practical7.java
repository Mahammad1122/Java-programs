import java.util.Scanner;
public class Practical7
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No.:");
        int no = input.nextInt();
        double sum = 0.0;
        for(int i=1; i <= no;i++)
        {
            sum += 1.0 / i;
        }
        System.out.println("Sum of Series = "+ sum);
        input.close();
    }
}