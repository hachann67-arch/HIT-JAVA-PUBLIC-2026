import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập x1: ");
        double x1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập y1: ");
        double y1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập x2: ");
        double x2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập y2: ");
        double y2 = Double.parseDouble(scanner.nextLine());
        double khoangCach = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.printf("Khoảng cách giữa hai điểm A và B là: %.2f%n", khoangCach);
    }
}
