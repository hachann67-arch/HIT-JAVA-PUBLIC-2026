import java.util.Scanner;
public class TinhHcn {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        double dai = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap chieu rong: ");
        double rong = Double.parseDouble(scanner.nextLine());
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        System.out.printf("Chu vi hinh chu nhat: %.2f%n", chuVi);
        System.out.printf("Dien tich hinh chu nhat: %.2f%n", dienTich);
    }
}