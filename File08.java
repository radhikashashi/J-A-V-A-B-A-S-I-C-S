// U T I L I T  -  Y M E T H O D S 

public class File08 {

    // 1. Add two numbers
    static int add(int a, int b) {
        return a + b;
    }

    // 2. Check even or odd
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // 3. Find maximum of two numbers
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // 4. Calculate square
    static int square(int n) {
        return n * n;
    }

    // 5. Reverse a string
    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(add(5, 3));
        System.out.println(isEven(4));
        System.out.println(max(10, 20));
        System.out.println(square(6));
        System.out.println(reverse("Java"));
    }
}
