import java.util.Scanner;
public class Practical3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter no1:");
        int no1 = input.nextInt();

        System.out.println("enter no2:");
        int no2 = input.nextInt();

        if(no1>no2)
        {
            System.out.println(no1+" Is greator");
        }
        else
        {
            System.out.println(no2+" Is greator");
        }
        input.close();
    }    
}
