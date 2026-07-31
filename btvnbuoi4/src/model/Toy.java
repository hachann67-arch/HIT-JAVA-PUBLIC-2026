package model;

public class Toy {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Toy(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        setPrice(price);
        setQuantity(quantity);
    }

    public void setPrice(double price) {
        if(price <=0){
            System.out.println("Giá bán không hợp lệ!");
        }
        else {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0){
            System.out.println("Số lượng không hợp lệ");
        }
        else {
            this.quantity = quantity;
        }
    }
    public double calculateDiscount(){
        return 0;
    }
    public void printInfo(){
        System.out.println("Mã: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Giá bán: " + price);
        System.out.println("Số lượng tồn kho: " + quantity);
    }

}
