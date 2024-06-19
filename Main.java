import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /* String s=sc.next();
        printname(s,0);*/


        /*int n=sc.nextInt();
        printNTo0(n);*/


        /*int n=sc.nextInt();
        print1ToN(n,1);*/

        /*int n=sc.nextInt();
        System.out.println(sumofN(5));*/


        /*int n=sc.nextInt();
        System.out.println(factorialofn(5));*/


        /*int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        reverseArray(a,0,n-1);
        for (int i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }*/


            /*int n=sc.nextInt();
            System.out.println(fibo(n));*/


        String s=sc.next();
        System.out.println(isPalindrome(s,0));
    }
    //Printing the name 5 times using recursion
    private static void printname(String s,int count)
    {
        if(count==5)
        {
            return ;
        }
        System.out.println(s);
        count++;
        printname(s,count);

    }
    //Printing numbers from 1 to N using Recursion
    private static void printNTo0(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        n--;
        printNTo0(n);

    }
    private static void print1ToN(int n,int n1)
    {

        if(n1==n+1)
        {
            return;
        }
        System.out.println(n1);
        n1++;
        print1ToN(n,n1);

    }
    //Sum of first N integers

    private static int sumofN(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+sumofN(n-1);

    }
    //Factorial of a number
    private static int factorialofn(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*factorialofn(n-1);
    }
    //Reversing an array using Recursion
    private static int reverseArray(int a[],int start,int end)
    {
        if(start<end)
        {
            int t=a[start];
            a[start]=a[end];
            a[end]=t;
            return reverseArray(a,start+1,end-1);
        }
        return 0;
    }
    //fibonacci-series
    private static int fibo(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    //Palindrome or not
    private static boolean isPalindrome(String s,int i)
    {
        if(i>s.length()/2)
        {
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1))
        {
            return false;
        }
        return isPalindrome(s,i+1);
    }
}