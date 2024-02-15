import java.util.*;
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // find integers with even number of digits
        // int[] a = {12,345,2,6,7896};
        // System.out.println("Even number of digit is:" + evenDigit(a));

        // find max wealth
        int[][] a = {{1,5,8},{2,7,2},{9,4,6}};
        System.out.println("Maximum wealth is:" + maxWealth(a));
    }
    static int evenDigit(int[] a){
        int digit = 0;
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i]<0){
                a[i] = a[i] * -1;
            }
            if(a[i] == 0){
                digit++;
            }
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
    
    static int maxWealth(int[][] a){
        int max = 0;
        for(int i = 0; i < a.length; i++){
            int sum = 0;
            for(int j = 0; j < a[i].length; j++){
                sum += a[i][j];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
