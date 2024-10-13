interface Iterable
{
    void display(int[] arr);
}
interface cal
{
    void sum(int[] arr);
}
public class Practical28 implements Iterable,cal {
    public void display(int[] arr)
    {
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public void sum(int[] arr)
    {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }   
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Practical28 i = new Practical28();
        i.display(arr);
        i.sum(arr);
    }
}
/*
 * Output:
 *          1
 *          2
 *          3
 *          4
 *          5
 *          15
 */
