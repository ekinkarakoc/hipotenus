import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b;

        double c;

        System.out.println("birinci kenarı giriniz");

        a = scanner.nextInt();

        System.out.println("ikinci kenarı giriniz");

        b = scanner.nextInt();

        c = Math.sqrt(a*a + b*b);

        System.out.println("hipotenus : "+ c);
    }
}