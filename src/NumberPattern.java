import java.util.Scanner;

class NumberPattern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n;
        int sumEven = 0;
        int oddCount = 0;
        int largest = 0;

        System.out.print("Enter N : ");
        n = sc.nextInt();

        System.out.print("Numbers : ");

        for(int i = 1; i <= n; i++)
        {
            System.out.print(i + " ");

            if(i % 2 == 0)
            {
                sumEven = sumEven + i;
            }

            if(i % 2 != 0)
            {
                oddCount++;
            }

            if(i % 5 == 0)
            {
                largest = i;
            }
        }

        System.out.println();
        System.out.println("Sum of Even Numbers : " + sumEven);
        System.out.println("Odd Count : " + oddCount);
        System.out.println("Largest Multiple of 5 : " + largest);

    }
}