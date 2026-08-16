package bai3;

public class Account {
    protected String username;
    protected String email;
    protected Address address;

    public Account(String username, String email, Address address) {
        this.username = username;
        this.email = email;
        this.address = address;
    }
    public double getDiscount(){
        return 0.0;
    }
    @Override
    public String toString(){
        return "User: " + username + "| Email: " + email + "| Địa chỉ: " + address.toString();
    }
}
