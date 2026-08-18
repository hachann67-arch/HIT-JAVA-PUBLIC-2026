import java.util.ArrayList;
public class Store {
    private ArrayList<Smartphone> inventory;

    public Store() {
        inventory = new ArrayList<>();
    }
    public void addPhone(Smartphone phone){
        inventory.add(phone);
    }
    public Smartphone search(String id){
       for(Smartphone phone : inventory){
           if(phone.getId().equalsIgnoreCase(id)){
               return phone;
           }
       }
       return null;
    }
    public ArrayList<Smartphone> search(double minPrice, double maxPrice){
        ArrayList<Smartphone> result = new ArrayList<>();
        for(Smartphone phone : inventory){
            if(phone.getPrice() >= minPrice && phone.getPrice() <= maxPrice){
                result.add(phone);
            }
        }
        return result;
    }
    public ArrayList<Smartphone> search(String keyword, boolean isSearchByName){
        ArrayList<Smartphone> result = new ArrayList<>();
        if(isSearchByName){
            for(Smartphone phone : inventory){
                if(phone.getName().toLowerCase().contains(keyword.toLowerCase())){
                    result.add(phone);
                }
            }
        } else{
            Smartphone phone = search(keyword);
            if(phone != null){
                result.add(phone);
            }
        }
        return result;
    }
    public void displayInventory(){
        if(inventory.isEmpty()){
            System.out.println("Kho hàng đang rỗng.");
        }else{
            for(Smartphone phone : inventory){
                phone.displayInfo();
            }
        }
    }
    public void sellPhone(Customer customer, String phoneId){
        Smartphone phone = search(phoneId);
        if(phone == null){
            System.out.println("Không tìm thấy sp");
            return;
        }
        if(phone.getStock() > 0){
            phone.setStock(phone.getStock() - 1);
            customer.addCart(phone);
        }
        else{
            System.out.println("Sản phẩm đã hết hàng");
        }
    }
}
