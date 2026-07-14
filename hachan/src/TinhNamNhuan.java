import java.util.Scanner;
public class TinhNamNhuan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap nam: ");
        int nam = Integer.parseInt(scanner.nextLine());
        if((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0){
            System.out.printf("Nam %d la nam nhuan.%n", nam);
        }
        else{
            System.out.printf("Nam %d khong la nam nhuan.%n", nam);
        }
    }
}
