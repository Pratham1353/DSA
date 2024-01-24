import java.util.*;
class P1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Three numbers");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println(max(a,b,c));

        // System.out.print("Enter the number:");
        // int n = sc.nextInt();
        // fibonacci(n);

        // System.out.print("Enter any number:");
        // int n = sc.nextInt();
        // System.out.print("Enter number you want find occurence:");
        // int a = sc.nextInt();
        // occurence(n,a);

        // System.out.print("Enter any number:");
        // int n = sc.nextInt();
        // reverse(n);

        System.out.print("Enter any number:");
        int n = sc.nextInt();
        prime(n);
    }
    public static int max(int a,int b, int c){
        if(a>b){
            if(a>c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if(b>c){
                return b;
            }
            else{
                return c;
            }
        }
    }
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
    public static void occurence(int n, int a){
        int count = 0;
        int b;
        while(n>0){
            b = n%10;
            if(b==a){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
    public static void reverse(int n){
        int a;
        int reverse = 0;
        while(n>0){
            a = n%10;
            reverse = 10*reverse + a;
            n=n/10;
        }
        System.out.println(reverse);
    }

    public static void prime(int n){
        int flag = 0;
        for(int i = 2; i < n; i++){
            if(n%i == 0){
                System.out.println(n + " is not a prime number.");
                flag++;
                break;
            }
        }
        if(flag == 0){
            System.out.println(n + " is a prime number.");
        }
    }
}