import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh: ");
        int n = Integer.parseInt(scanner.nextLine());
        double[] scores = new double[n];
        for(int i=0;i<n;i++){
            System.out.printf("Nhập điểm học sinh thứ %d: ",i+1);
            scores[i] = Double.parseDouble(scanner.nextLine());
        }
        System.out.printf("Điểm cao nhất: %.1f%n", findMax(scores));
        System.out.printf("Điểm trung bình lớp: %.2f%n", calculateAverage(scores));
        System.out.printf("Số học sinh có điểm dưới trung bình (<5.0): %d", countFailedStudents(scores));
    }
    public static double findMax(double[] arr){
        double max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static double calculateAverage(double[] arr){
        double tong = 0;
        for(int i=0;i<arr.length;i++){
            tong += arr[i];
        }
        return tong/arr.length;
    }
    public static int countFailedStudents(double[] arr){
        int dem = 0;
        for(double diem : arr){
            if(diem<5){
                dem++;
            }
        }
    return dem;
    }
}
