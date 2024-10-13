public class Practical13
{
    public static void main(String[] args) {
        int sub1 = Integer.parseInt(args[0]);
        int sub2 = Integer.parseInt(args[1]);
        int sub3 = Integer.parseInt(args[2]);
        int total = sub1+sub2+sub3;
        System.out.println("Total(300) = "+total);
        double per = total*100/300;
        System.out.println("Percantage = "+per);
        char grade = ' ';
        if (per <= 100 && per > 80) {
            grade = 'A';
        }
        else if (per <= 80 && per > 60) {
            grade = 'B';
        }
        else if (per <=60 && per > 40) {
            grade = 'C';
        }
        else
        {
            grade = 'F';
        }
        System.out.println("Grade = "+grade);
    }
}