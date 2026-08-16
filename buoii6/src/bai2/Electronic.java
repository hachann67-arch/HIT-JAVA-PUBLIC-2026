package bai2;

public class Electronic extends Productt{
    private int warrantyMonths;

    public Electronic(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }
    @Override
    public double getDiscountedPrice(){
        return 1.05 * price;
    }
    @Override
    public void showInfo(){
        System.out.println("ID: " + id + " |Tên: " + name + " |Giá gốc: " + price + " |Giá bán: " + getDiscountedPrice() + "|Bảo hành: " + warrantyMonths);
    }
    @Override
    public String toString(){
        return super.toString() + ", warrantyMonths: "+warrantyMonths;
    }
}
