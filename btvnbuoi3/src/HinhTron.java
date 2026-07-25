import java.util.Scanner;
public class HinhTron {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double chuVi = 2*3.14*r;
        double dienTich = 3.14*r*r;
        System.out.printf("%.3f %.3f", chuVi, dienTich);
    }
}
