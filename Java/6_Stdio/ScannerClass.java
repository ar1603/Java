import java.util.Scanner;

public class ScannerClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // boolean a = sc.nextBoolean();
        // byte a = sc.nextByte();
        int a = sc.nextInt();
        System.out.println(a);
        Double b = sc.nextDouble();
        System.out.println(b);

        // String b = sc.nextLine();// Entire line;
        // String b = sc.next();// Next token/word;
        sc.close();
    }
}
