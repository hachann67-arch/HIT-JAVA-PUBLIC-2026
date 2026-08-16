package bai2;

public class Book extends Productt{
    private String author;
    private int pages;

    public Book(String id, String name, double price, String author, int pages) {
        super(id, name, price);
        this.author = author;
        this.pages = pages;
    }
    @Override
    public double getDiscountedPrice(){
        return 0.9*price;
    }
    @Override
    public void showInfo(){
        System.out.println("ID: " + id + " |Tên: " + name + " |Giá gốc: " + price + " |Giá bán: " + getDiscountedPrice() + "|Tác giả: " + author + " |Trang: " + pages);
    }
    @Override
    public String toString(){
        return super.toString() + ", author: " + author + ", pages: " + pages;
    }
}
