import java.util.*;
public class Condition_and_Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your Sallary:");
        // int sallary = sc.nextInt();
        // if(sallary>=10000){
        //     sallary += 2000;
        // }
        // else{
        //     sallary += 1000;
        // }
        // System.out.println("Sallary with bonus:" + sallary);

        System.out.print("Enter a number:");
        int num = sc.nextInt();
        for (int i = 1; i<= num; i++){
            System.out.println(i);
        }
    }
}
