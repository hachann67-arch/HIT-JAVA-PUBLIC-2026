package bai2;

public class Product {
    protected String name;
    protected double price;

    public double getFinalPrice() {
        return price;
    }
    public void showInfo(){
        System.out.println("Tên sp: "+name+" - "+price);
    }
}
