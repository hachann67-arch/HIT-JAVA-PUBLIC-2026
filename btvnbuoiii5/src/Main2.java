import java.util.ArrayList;
public class Main2 {
    public static void main(String[] args){
        Smartphone sp1 = new Smartphone("iPhone 15 Pro", 28000000,10);
        Smartphone sp2 = new Smartphone("Samsung Galaxy S24", 21000000,5);
        Customer customer = new Customer("Nguyễn Văn A");
        customer.addCart(sp1);
        customer.addCart(sp2);
        customer.displayCart();
        ArrayList<Smartphone> externalCart = customer.getCart();
        externalCart.clear();
        System.out.println("Số lượng sản phẩm trong giỏ: " + customer.getCart().size());
        customer.displayCart();
    }
}