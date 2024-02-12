import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int x = sc.nextInt();
        int a = x/1000;
        int b = (x/100) % 10;
        int c = (x/10) % 10;
        int d = x % 10;
        System.out.println((a + c) == Math.abs(b - d));
    }
}