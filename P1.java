import java.math.*;
import java.lang.Math;
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

        // System.out.print("Enter any number:");
        // int n = sc.nextInt();
        // prime(n);

        // System.out.print("Enter any number:");
        // int n = sc.nextInt();
        // armstrong(n);

        // System.out.print("Enter number of elements of array:");
        // int n = sc.nextInt();
        // System.out.print("Enter elements of array:");
        // int[] a = new int[n];
        // for(int i = 0; i< n; i++){
        //     a[i] = sc.nextInt(); 
        // }
        // System.out.print("Enter element you want to find:");
        // int x = sc.nextInt();
        // // linearSearch(a,n,x);
        // binarysearch(a,0,n,x);

        System.out.print("Enter any Float number:");
        float a = sc.nextFloat();
        System.out.println("Ceiling value of " + a + " is " + Math.ceil(a));
        System.out.println("Floor value of " + a + " is " + Math.floor(a));
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

    public static void armstrong(int n){
        int a=0;
        int dig = 0;
        int b = 0;
        int c = n;
        while(c>0){
            dig++;
            c=c/10;
        }
        c=n;
        while(c>0){
            a=c%10;
            b+=(Math.pow(a, dig));
            c=c/10;
        }
        if(n == b){
            System.out.println(n + " is armstrong number.");
        }
        else{
            System.out.println(n + " is not armstrong number.");
        }
    }

    public static void linearSearch(int a[],int n, int x){
        for(int  i = 0; i < n; i++){
            if(a[i] == x){
                System.out.println("Elment " + x + " is at index " + i);
            }
        }
    }

    public static void binarysearch(int a[],int mid, int n,int x){
        mid = n/2;
        if(a[mid] == x){
            System.out.println("Element " + x + " is at index " + mid);
        }
        else if(a[mid] < x){
            binarysearch(a, mid+1, n, x);
        }
        else if(a[mid] > x){
            binarysearch(a, 0, mid, x);
        }
    }
}