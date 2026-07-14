import java.util.Scanner;
public class TinhN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = Integer.parseInt(scanner.nextLine());
        long giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }
        int tong = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                tong += i;
            }
        }
        System.out.printf("Giai thua cua n: %d%n", giaiThua);
        System.out.printf("Tong phan tu chan cua n: %d%n", tong);
    }
}
