public class Main1 {
    public static void main(String[] args) {
        Smartphone sp1 = new Smartphone("IPhone 15 Pro", 28000000,10);
        Smartphone sp2 = new Smartphone("Samsung Galaxy S24",-15000000,5);
        Smartphone sp3 = new Smartphone("Xiaomi 14", 18000000,-2);
        sp1.displayInfo();
        sp2.displayInfo();
        sp3.displayInfo();
        System.out.println("Tổng số điện thoại: " + Smartphone.getTotalPhones());
    }
}
