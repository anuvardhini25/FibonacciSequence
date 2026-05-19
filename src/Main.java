import java.util.Scanner;
 class FibonacciSequence {

    static void fibonacci(int limit) {

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Sequence:");

        while (first <= limit) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the upper limit: ");
        int limit = sc.nextInt();

        fibonacci(limit);

        sc.close();
    }
}