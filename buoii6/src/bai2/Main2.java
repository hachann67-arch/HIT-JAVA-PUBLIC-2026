package bai2;
import java.util.List;
import java.util.ArrayList;
public class Main2 {
    public static void main(String[] args){
        List<Productt> products = new ArrayList<>();
        products.add(new Book("B01","Lập trình Java",200000,"Nguyễn Văn A",350));
        products.add(new Book("B02", "Cấu trúc dữ liệu", 120000, "Trần Thị B", 280));
        products.add(new Electronic("E01", "Laptop Dell XPS", 25000000, 24));
        products.add(new Electronic("E02", "Tai nghe Bluetooth", 1500000, 12));
        products.add(new Food("F01", "Sữa tươi nguyên chất", 35000, "20/12/2026"));
        double totalOriginalPrice = 0;
        double totalDiscountedPrice = 0;
        for(Productt p : products){
            p.showInfo();
            System.out.println(p.toString());
            totalDiscountedPrice += p.getDiscountedPrice();
            totalOriginalPrice += p.getPrice();
        }
        System.out.printf("Tổng giá trị kho hàng (Giá gốc)  : %,.2f VNĐ\n", totalOriginalPrice);
        System.out.printf("Tổng giá trị nếu bán hết (Đã điều chỉnh): %,.2f VNĐ\n", totalDiscountedPrice);
    }
}
