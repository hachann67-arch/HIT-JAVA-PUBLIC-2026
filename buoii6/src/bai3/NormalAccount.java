package bai3;

public class NormalAccount extends Account{
    public NormalAccount(String username, String email, Address address) {
        super(username, email, address);
    }
    @Override
    public double getDiscount(){
        return 0.02;
    }
    @Override
    public String toString(){
        return "Loại: Normal " + super.toString();
    }
}
