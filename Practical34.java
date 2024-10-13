import java.util.Scanner;
public class Practical34 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the string :");
        String str = input.nextLine();
        System.out.print("Enter the word to find occurance :");
        String str2 = input.nextLine();

        String[] str3 = str.split(" ");
        int occur = 0;
        for (String string : str3) {
            if(string.equals(str2))
            {
                occur++;
            }
        }
        System.out.println(str2+" is occur "+occur+" times");
        input.close();
    }
}
/*
 * output:
 *  Enter the string: hello computer hello bca hello world
 *  Enter the word to find occurance: hello
 *  hello  is occur 3 times
 */