import java.util.Scanner;
public class ChuoiDoiXung {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String chuoi = scanner.nextLine();
        boolean laDoiXung = true;
        int doDai = chuoi.length();
        for(int i=0;i<doDai/2;i++) {
            if (chuoi.charAt(i) != chuoi.charAt(doDai - i - 1)) {
                laDoiXung = false;
                break;
            }
        }
        if(laDoiXung){
            System.out.print(chuoi.toUpperCase());
            System.out.print(" chuỗi này đối xứng");
        }
        else{
            System.out.print(chuoi.toLowerCase());
            System.out.print(" chuỗi này không đối xứng");
        }
    }
}
