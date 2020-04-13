import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void solution1(long a, long b) {
        long sum1 = (a * a) + (b * b);
        long sum2 = (a + b) * (a + b);
        if (sum1 > sum2)
            System.out.println("Сумма квадратов больше: " + sum1);
        System.out.println("Квадрат суммы больше: " + sum2);
    }

    public static void solution2(int e, long salary) {
        if (e >= 2 && e < 5) {
            long addition = (long) (salary * 0.02);
            long res = salary + addition;
            System.out.println("Надбавка к зарплате - " + addition);
            System.out.println("Сумма выплат - " + res);
        }
        else if (e >=5 && e <= 10) {
            long addition = (long) (salary * 0.05);
            long res = salary + addition;
            System.out.println("Надбавка к зарплате - " + addition);
            System.out.println("Сумма выплат - " + res);
        }
        else
            System.out.println("Недопустимый стаж!");
    }

    public static void dist(int x1, int y1, int x2, int y2) {
        double d1 = Math.sqrt((x1 * x1) + (y1 * y1));
        double d2 = Math.sqrt((x2 * x2) + (y2 * y2));
        if (d1 > d2) {
            System.out.println("Точка A" + d1);
        } else {
            System.out.println("Точка B" + d2);
        }
    }

    public static boolean isRightTriange(int a, int b, int c) {
        if (a > b && a > c) {
            return Math.sqrt(b * b + c * c) == a;
        }
        else if (b > a && b > c) {
            return Math.sqrt(a * a + c * c) == b;
        }
        else if (c > a && c > b) {
            return Math.sqrt(a * a + b * b) == c;
        }
        return false;
    }

    public static void doSqareOrNot(int a, int b, int c) {
        if (a > 0) {
            System.out.println(a * a);
        }
        else System.out.println(a);

        if (b > 0) {
            System.out.println(b * b);
        }
        else System.out.println(b);

        if (c > 0) {
            System.out.println(c * c);
        }
        else System.out.println(c);
    }

    public static void whatMonthNow(int number) {
        switch (number) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Incorrect input!");
        }
    }


    private static int sumOfNumbers(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static void multThreeNotFive(int N) {
        int i = 0;
        do {
            if ((i % 5 != 0) & (i % 3 == 0) && (sumOfNumbers(i) % 5 != 0) && (sumOfNumbers(i) % 3 == 0)) {
                System.out.println(i);
            }
            i++;
        }
        while (i <= N);
    }

    public static void multFive(int N) {
        int i = 0;
        while (i <= N) {
            if (i % 5 == 0)
                System.out.println(i);
            i++;
        }
    }

    public static void isPowerOfTwo(int i) {
        while (i != 1 && i % 2 == 0) {
            i /= 2;
        }
        System.out.println(i == 1 ? "YES" : "NO");
    }

    public static void fib(int N) {
        int fib1 = 1;
        int fib2 = 1;
        int i = 0;
        int sum = 0;
        while (i < N - 2) {
            sum += fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
            i++;
        }
    }

    public static void directOrderNumbers(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            System.out.println(i);
            count++;
        }
        System.out.println("Count " + count);
    }

    public static void reversedOrder(int a, int b) {
        int count = 0;
        for (int i = b; i >= a; i--) {
            System.out.println(i);
            count++;
        }
        System.out.println("Count " + count);
    }

    public static void power(double a, int n) {
        double result = 1;
        for (int i = 1; i <= n; i++){
            result *= a;
        }
        System.out.println(result);
    }

    public static void allPowers(double a, int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= a;
            System.out.println(a + "in power of" + i + "is " + result);
        }
    }

    private static int[] inputNumbers(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input " + i + "number");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void evenOdd(int n) {
        int[] arr = inputNumbers(n);

        System.out.println("Even");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                System.out.println(arr[i]);
        }

        System.out.println("Odd");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0)
                System.out.println(arr[i]);
        }
    }

    public static void dvideByThreeOrNine(int n) {
        int[] arr = inputNumbers(n);

        System.out.println("Divide by three or nine");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0 || arr[i] % 9 == 0)
                System.out.println(arr[i]);
        }
    }

    public static void divideByFiveOrTen(int n) {
        int[] arr = inputNumbers(n);

        System.out.println("Divide by five or ten");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 5 == 0 || arr[i] % 10 == 0)
                System.out.println(arr[i]);
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        else return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void gcdAndLcm(int n) {
        int p = 1;
        int[] arr = inputNumbers(n);

        int lcmVal = 0;
        int gcdVal = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length) {
                for (int j = i + 1; j <= arr.length; j++) {
                    gcdVal = gcd(arr[i], arr[j]);
                    p = arr[i] * arr[j];
                    lcmVal = p / gcdVal;
                }
                arr[i + 1] = lcmVal;
                arr[i + 1] = gcdVal;
            }
        }
    }

    public static boolean checkSimple(int i){
        if (i<=1)
            return false;
        else if (i <=3)
            return true;
        else if (i%2==0 || i %3 ==0)
            return false;
        int n = 5;
        while (n*n <=i){
            if (i % n ==0 || i % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
    }

    public static void printSimpleNumbers(int n) {
        int[] arr = inputNumbers(n);

        for (int i = 0; i < arr.length; i++) {
            if (checkSimple(arr[i]))
                System.out.println(arr[i]);
        }
    }

    private static int counter = 2;
    private static boolean isLucky(int n) {
        int next_position = n;
        if(counter > n)
            return true;
        if(n%counter == 0)
            return false;

        next_position -= next_position/counter;

        counter++;
        return isLucky(next_position);
    }

    public static void luckyNumbers(int n) {
        int[] arr = inputNumbers(n);

        for (int i = 0; i < arr.length; i++) {
            if (isLucky(arr[i]))
                System.out.println(arr[i]);
        }
    }

    public static void handwrittenNumber() {
        int n = new Random().nextInt(10);

        switch (n) {
            case 0:
                System.out.println("Ноль");
                break;
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            case 4:
                System.out.println("Четыре");
                break;
            case 5:
                System.out.println("Пять");
                break;
            case 6:
                System.out.println("Шесть");
                break;
            case 7:
                System.out.println("Семь");
                break;
            case 8:
                System.out.println("Восемь");
                break;
            case 9:
                System.out.println("Девять");
                break;
            default:
                System.out.println("");
        }
    }

}
