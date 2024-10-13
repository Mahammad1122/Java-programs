public class Practical12 {
    public static void main(String[] args) {
        int[] no = {1,4,6,8,3,2};
        int temp;
        System.out.println("Before Sorting of Array:");
        for(int n : no)
        {
            System.out.println(n);
        }
        for(int i = 0; i< no.length ; i++)
        {
            for(int j = i+1; j < no.length ; j++)
            {
                if(no[i] > no[j])
                {
                    temp = no[i];
                    no[i] = no[j];
                    no[j] = temp;
                }
            }
        }
        System.out.println("after Sorting of Array:");
        for(int n : no)
        {
            System.out.println(n);
        }
    }
}