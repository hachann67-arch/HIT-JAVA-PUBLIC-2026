import java.util.Scanner;
public class HanhTrinhMuCuaKeLeoNui {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = scanner.nextInt();
            }
            int dem = 0;
            int truoc = arr[0];
            int hienTai = arr[1];
            int index = 0;
            for(int x : arr){
                if(index < 2){
                    index++;
                    continue;
                }
                if(hienTai > truoc && hienTai>x){
                    dem++;
                }
                truoc = hienTai;
                hienTai = x;
                index++;
            }
            System.out.println(dem);
    }
}
