public class Practical42 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            arr[0] = 1;
            arr[1] = 2;
            arr[6] = 0;
        } catch (Exception e) {
            System.out.println("Error = "+ e);
        } finally{
            for(int i : arr){
                System.out.println(i);
            }
        }
        System.out.println("array length = "+ arr.length);
    }
}
/* OutPut:
Error = java.lang.ArrayIndexOutOfBoundsException: 6
1
2
0
0
0
array length = 5
 */