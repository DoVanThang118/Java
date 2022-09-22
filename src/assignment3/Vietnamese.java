package assignment3;

public class Vietnamese {
    public int id;
    public String name;
    public int date;
    public String demand;
    public int amount;
    public int price;

    public Vietnamese() {
    }

    public Vietnamese(int id, String name, int date, String demand, int amount, int price) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.demand = demand;
        this.amount = amount;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getDemand() {
        return demand;
    }

    public void setDemand(String demand) {
        this.demand = demand;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int money(){
        int t;
        if (getAmount()<=50){
            t = getAmount()*1000;
        }else if (50<getAmount()&&getAmount()<=100){
            t = 50*1000+(getAmount()-50)*1200;
        }else if (100<getAmount()&&getAmount()<=200){
            t = 50*1000+50*1200+(getAmount()-100)*1500;
        }else {
            t = 50*1000+50*1200+100*1500+(getAmount()-200)*2000;
        }
        return t ;
    }
}
