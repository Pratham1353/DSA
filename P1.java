import java.util.*;
class P1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Three numbers");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println(max(a,b,c));

        System.out.print("Enter the number:");
        int n = sc.nextInt();
        fibonacci(n);
    }
    // public static int max(int a,int b, int c){
    //     if(a>b){
    //         if(a>c){
    //             return a;
    //         }
    //         else{
    //             return c;
    //         }
    //     }
    //     else{
    //         if(b>c){
    //             return b;
    //         }
    //         else{
    //             return c;
    //         }
    //     }
    // }
    public static void fibonacci(int n){
        int FT = 0;
        int ST = 1;
        int NT;
        while(n>0){
            System.out.println(FT);
            NT = FT + ST;
            FT = ST;
            ST = NT;
            n--;
        }
    }
}