import java.util.Scanner;
public class TimSoTrungVi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println((a<b && a>c) || (a<c && a>b) ? a : (b<a && b>c) || (b<c && b>a) ? b : c);
    }
}
