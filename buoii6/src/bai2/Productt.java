package bai2;

public class Productt {
    protected String id;
    protected String name;
    protected double price;

    public Productt(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountedPrice(){
        return price;
    }
    public void showInfo(){
        System.out.println("ID: " + id + " |Tên: " + name + " |Giá gốc: " + price + " |Giá bán: " + getDiscountedPrice());
    }
    @Override
    public String toString(){
        return "id: " + id + ", name: " + name + " , price: " + price;
    }
}
