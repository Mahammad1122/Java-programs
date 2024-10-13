import java.util.Scanner;
public class Practical8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number :");
        int no = input.nextInt();
        int i = 2;
        while(i < no )
        {
            if(no % i != 0)
            {
                i++;
            }
            else
            {
                break;
            }
        }
        if(no == i)
        {
            System.out.println(no+" is prime");
        }
        else
        {
            System.out.println(no+" is not prime");
        }
        input.close();
    }
}
