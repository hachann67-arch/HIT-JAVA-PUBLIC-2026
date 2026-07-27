import java.util.Scanner;
import java.util.Random;
public class PhepCongNgauNhien {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(101);
        int b = random.nextInt(101);
        int c = random.nextInt(201);
        System.out.println(a + " + " + b + " = " + c);
        String nhap = scanner.nextLine();
        if(a+b==c && nhap.equalsIgnoreCase("phép tính đúng")){
            System.out.print("Bạn đã trả lời đúng");
        }
        else if(!(a+b==c) && nhap.equalsIgnoreCase("phép tính sai")){
            System.out.print("Bạn đã trả lời đúng");
        }
        else{
            System.out.print("Bạn đã trả lời sai");
        }
    }
}
