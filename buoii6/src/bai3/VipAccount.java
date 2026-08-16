package bai3;

public class VipAccount extends Account{
    private int points;

    public VipAccount(String username, String email, Address address, int points) {
        super(username, email, address);
        this.points = points;
    }
    public void addPoints(int point){
        int oldPoints = this.points;
        this.points += point;
        if(oldPoints < 1000 && this.points >= 1000){
            System.out.println("Tài khoản đủ điều kiện nâng hạng");
        }
    }
    @Override
    public double getDiscount(){
        if(points >= 1000){
            return 0.1;
        }
        else{
            return 0.05;
        }
    }
    @Override
    public String toString(){
        return "Loại VIP " + super.toString() + "|Điểm tích lũy: " + points;
    }
}
