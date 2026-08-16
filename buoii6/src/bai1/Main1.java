package bai1;

public class Main1 {
    public static void main(String[] args){
        Customer c = new Customer("Nguyễn Văn A", "0987654321","123 Lê Lợi, TPHCM");
        Order order = new Order("T06",c);
        order.addProduct(new Product("P01","Bàn phím cơ",1500000,1));
        order.addProduct(new Product("P02","Chuột không dây",500000,1));
        order.addProduct(new Product("P03","Laptop Dell",1500000,1));
        order.printInvoice();
    }
}
