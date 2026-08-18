import java.util.ArrayList;
public class Customer {
    private String customerName;
    private ArrayList<Smartphone> cart;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.cart = new ArrayList<>();
    }
    public void addCart(Smartphone phone){
        cart.add(phone);
    }
    public void removePhone(String id){
        boolean found = false;
        for(int i=0;i<cart.size();i++){
            if(cart.get(i).getId().equalsIgnoreCase(id)){
                cart.remove(i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Không tìm thấy sản phẩm!");
        }
    }
    public void removePhone(int index){
        if(index >= 0 && index < cart.size()){
            cart.remove(index);
        }else{
            System.out.println("Lỗi index");
        }
    }
    public ArrayList<Smartphone> getCart(){
        ArrayList<Smartphone> copyCart = new ArrayList<>();
        for(Smartphone phone : this.cart){
            copyCart.add(phone);
        }
        return copyCart;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void displayCart(){
        if(cart.isEmpty()){
            System.out.println("Giỏ hàng đang rỗng.");
        } else{
            for(int i=0;i<cart.size();i++){
                System.out.print("["+i+"] ");
                cart.get(i).displayInfo();
            }
        }
    }
}
