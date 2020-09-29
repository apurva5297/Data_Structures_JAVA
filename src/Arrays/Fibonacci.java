package Arrays;

public class Fibonacci {
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String [] args)
    {
        int n = 6;
        System.out.println(fib(n));
    }
}

/* // Java program for Fibonacci Series using Space
// Optimized Method
class fibonacci
{
    static int fib(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
            a = b;
            b = c;
        }
        return b;
        {
            c = a + b;
    }

    public static void main (String args[])
    {
        int n = 9;
        System.out.println(fib(n));
    }
}
*/