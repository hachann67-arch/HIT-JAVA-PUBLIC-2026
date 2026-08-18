import java.util.ArrayList;
public class Main3 {
    public static void main(String[] args) {
        Store store = new Store();
        Smartphone sp1 = new Smartphone("iPhone 15 Pro", 28000000, 10);
        Smartphone sp2 = new Smartphone("iPhone 13", 15000000, 8);
        Smartphone sp3 = new Smartphone("Samsung Galaxy S24", 21000000, 5);
        Smartphone sp4 = new Smartphone("Samsung Galaxy A55", 9500000, 12);
        Smartphone sp5 = new Smartphone("Xiaomi 14", 18000000, 6);
        store.addPhone(sp1);
        store.addPhone(sp2);
        store.addPhone(sp3);
        store.addPhone(sp4);
        store.addPhone(sp5);
        store.displayInventory();
        Smartphone foundById = store.search("SP2");
        if (foundById != null) {
            System.out.print("Tìm thấy: ");
            foundById.displayInfo();
        } else {
            System.out.println("Không tìm thấy sản phẩm!");
        }
        ArrayList<Smartphone> priceResults = store.search(10000000, 20000000);
        if (priceResults.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong khoảng giá này.");
        } else {
            for (Smartphone phone : priceResults) {
                phone.displayInfo();
            }
        }
        ArrayList<Smartphone> nameResults = store.search("Samsung", true);
        if (nameResults.isEmpty()) {
            System.out.println("Không có sản phẩm nào khớp từ khóa.");
        } else {
            for (Smartphone phone : nameResults) {
                phone.displayInfo();
            }
        }
        Customer customer = new Customer("Nguyễn Văn A");
        Smartphone iphone15 = new Smartphone("iPhone 15", 20000000, 5);
        store.addPhone(iphone15);
        store.sellPhone(customer, iphone15.getId());
        Smartphone phoneInStore = store.search(iphone15.getId());
        phoneInStore.setPrice(25000000);
        Smartphone phoneInCart = customer.getCart().get(0);
        System.out.println("Tên sản phẩm trong giỏ: " + phoneInCart.getName());
        System.out.println("Giá sản phẩm trong giỏ: " + phoneInCart.getPrice() + " VNĐ");
    }
}
