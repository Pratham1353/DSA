import java.util.*;
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // find integers with even number of digits
        int[] a = {12,345,2,6,7896};
        System.out.println("Even number of digit is:" + evenDigit(a));
    }
    static int evenDigit(int[] a){
        int digit = 0;
        int count = 0;
        for(int i = 0; i < a.length; i++){
            while(a[i]>0){
                a[i] = a[i] / 10;
                digit++;
            }
            if(digit % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
