public class Practical10 {
    public static void main(String[] args) {
        int j=1;
        for(int i=1; i<=50;i++)
        {
            if(j == 5)
            {
                j=1;
                System.out.println(" ");
                continue;
            }
            else
            {
                j++;
                System.out.println(i);
            }
        }
    }
}
