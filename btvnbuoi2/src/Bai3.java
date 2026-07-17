import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mật khẩu: ");
        String matKhau = scanner.nextLine();
        String cleanedMatKhau = matKhau.trim();
        int length = cleanedMatKhau.length();
        boolean hasUpper = false;
        boolean hasDigit = false;
        for(int i=0;i<length;i++){
            char c = cleanedMatKhau.charAt(i);
            if(c>='0' && c<='9'){
                hasDigit = true;
            }
            if(c>='A' && c<='Z'){
                hasUpper = true;
            }
        }
        if(length>=8 && hasUpper && hasDigit){
            System.out.print("Mật khẩu hợp lệ!");
        }
        else{
            System.out.println("Mật khẩu không hợp lệ!");
            if(length<8){
                System.out.print("Mật khẩu phải có độ dài tối thiểu là 8 ký tự.");
            }
            else if(!hasUpper){
                System.out.print("Mật khẩu phải chứa ít nhất 1 chữ cái viết hoa.");
            }
            else{
                System.out.print("Mật khẩu phải chứa ít nhất 1 chữ số.");
            }
        }
    }
}
