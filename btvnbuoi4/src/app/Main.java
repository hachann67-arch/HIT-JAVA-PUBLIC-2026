package app;
import model.Toy;
import model.ElectronicToy;
import model.PlushToy;
public class Main {
    public static void main(String[] args) {
        Toy[] arr = new Toy[3];
        arr[0] = new Toy("E05","Bộ xếp hình", 250,200);
        arr[1] = new ElectronicToy("T02","Robot thông minh",500,6,12);
        arr[2] = new PlushToy("Gấu bông Teddy","M01",150,300,"Bông gòn");
        for(int i=0;i<arr.length;i++){
            arr[i].printInfo();
            System.out.println(" ");
        }
    }
}