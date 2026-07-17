import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cạnh b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cạnh c: ");
        int c = Integer.parseInt(scanner.nextLine());
        if(a+b>c && a+c>b && b+c>a){
            if(a==b && a==c){
                System.out.println("Đây là tam giác đều");
            }
            else if(a==b || a==c || b==c){
                System.out.println("Đây là tam giác cân");
            }
            else{
                System.out.println("Đây là tam giác thường");
            }
            double p = (a+b+c)/2.0;
            double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.printf("Chu vi: %d%n", a+b+c);
            System.out.printf("Diện tích: %.2f", S);
        }
        else{
            System.out.print("Ba cạnh đã nhập không tạo thành một tam giác hợp lệ");
        }
    }
}
