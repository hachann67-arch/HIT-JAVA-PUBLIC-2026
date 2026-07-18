import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập thông tin nhân viên: ");
        String rawInput = scanner.nextLine();
        String[] parts = rawInput.trim().split("-");
        if(parts.length < 4){
            System.out.println("Thông tin nhập vào không đúng định dạng!");
            return;
        }
        String code = parts[0].trim();
        String rawName = parts[1].trim();
        String rawYear = parts[2].trim();
        String department = parts[3].trim();
        String formattedName = capitalizeName(rawName);
        if(department.toLowerCase().contains("kỹ thuật") || department.toLowerCase().contains("ky thuat")){
            System.out.println("Phân loại: Nhân viên kĩ thuật");
        }
        else{
            System.out.println("Phân loại: Nhân viên nghiệp vụ");
        }
        int birthYear = Integer.parseInt(rawYear);
        int age = 2026 - birthYear;
        System.out.println("Mã nhân viên: " + code + " | Họ và tên: " + formattedName + " | Tuổi: " + age + " | Bộ phận: " + department);
    }
    public static String capitalizeName(String name){
        String[] words = name.split("\\s+");
        String results = "";
        for(int i=0;i<words.length;i++){
            String word = words[i];
            if(word.length()>0){
                String firstChar = word.substring(0,1).toUpperCase();
                String remaining = word.substring(1).toLowerCase();
                results += firstChar + remaining;
                if(i<words.length -1){
                    results += " ";
                }
            }
        }
        return results.trim();
    }
}
