package bai3;
import java.util.List;
import java.util.ArrayList;
public class Main3 {
    public static void main(String[] args) {
        Address addr1 = new Address("123 Lê Lợi", "TP. Hồ Chí Minh", "7000");
        Address addr2 = new Address("456 Trần Phú", "Đà Nẵng", "50000");
        Address addr3 = new Address("789 Cầu Giấy", "Hà Nội", "10000");
        List<Account> accounts = new ArrayList<>();
        accounts.add(new NormalAccount("nguyenvana", "ana@gmail.com", addr1));
        accounts.add(new VipAccount("tranvanb", "bvip@gmail.com", addr2, 500));
        accounts.add(new VipAccount("lethic", "cvip@gmail.com", addr3, 1200));
        double orderAmount = 2000000.0;
        System.out.println("Giá trị đơn hàng mặc định: " + orderAmount);
        for (Account acc : accounts) {
            double discountRate = acc.getDiscount();
            double finalPrice = orderAmount * (1 - discountRate);
            System.out.println("Tổng tiền phải trả " + finalPrice);
        }
    }
}
