public class Smartphone {
    private static int totalPhones = 0;
    private String id;
    private String name;
    private double price;
    private int stock;

    public Smartphone(String name, double price, int stock) {
        totalPhones++;
        this.id = "SP" + totalPhones;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public static int getTotalPhones(){
        return totalPhones;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.out.println("Lỗi");
            this.price = 0;
        }else {
            this.price = price;
        }
    }

    public void setStock(int stock) {
        if(stock < 0){
            System.out.println("Lỗi");
            this.stock = 0;
        }else {
            this.stock = stock;
        }
    }
    public void displayInfo(){
        System.out.println("ID: " + id + " | Tên: " + name + " | Giá: " + price + " | Tồn kho: " + stock);
    }
}
