package bai2;

public class Food extends Productt{
    private String expiryDate;

    public Food(String id, String name, double price, String expiryDate) {
        super(id, name, price);
        this.expiryDate = expiryDate;
    }
    @Override
    public double getDiscountedPrice(){
        return price;
    }
    @Override
    public void showInfo(){
        System.out.println("ID: " + id + " |Tên: " + name + " |Giá gốc: " + price + " |Giá bán: " + getDiscountedPrice() + "|Hạn sử dụng: "+expiryDate);
    }
    @Override
    public String toString(){
        return super.toString() + ",expiryDate: " + expiryDate;
    }
}
