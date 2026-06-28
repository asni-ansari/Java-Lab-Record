public class Factorial
{
    static int factorial(int n)
    {
        // Stopping condition
        if (n == 0 || n == 1)
            return 1;

        // factorial(n) = n * factorial(n-1)
        return n * factorial(n - 1);
    }

    public static void main(String args[])
    {
        System.out.println(factorial(5));
    }
}