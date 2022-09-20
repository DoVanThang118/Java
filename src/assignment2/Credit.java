package assignment2;

public class Credit {
    private int amount;

    public Credit() {
        System.out.println("Nạp tiền tài khoản !!!!!");
    }

    public Credit(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean ktAmount(){
        return getAmount()>0;
    }

    public int credit(){
//        do {
//            System.out.println("số tiền nạp vào không hợp lệ, xin mời nhập lại !!!!!");
//        }while (!ktAmount());
        if (!ktAmount()) return 0;
        return getAmount()+ Account.getBalance();

    }
}
