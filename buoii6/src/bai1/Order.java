package bai1;
import java.util.List;
import java.util.ArrayList;

public class Order {
    private String orderId;
    private Customer customer;
    private List<Product> items;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<>();
    }
    public void addProduct(Product p){
        items.add(p);
    }
    public double getTotal(){
        double total = 0;
        for(Product p : items){
            total += p.getSubtotal();
        }
        return total;
    }
    public void printInvoice(){
        System.out.println(customer.getName() + " - " + customer.getPhone() + " - " + customer.getAddress());
        for(Product p : items){
            System.out.println(p.getId() + " - " + p.getName() + " - " + p.getPrice() + " - " + p.getQuantity() + " - ");
        }
    }
}
