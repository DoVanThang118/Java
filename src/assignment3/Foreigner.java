package assignment3;

public class Foreigner {
    public int id;
    public String name;
    public int date;
    public int nationality;
    public int amount;
    public int quota;

    public Foreigner() {
    }

    public Foreigner(int id, String name, int date, int nationality, int amount, int quota) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.nationality = nationality;
        this.amount = amount;
        this.quota = quota;
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

    public int getNationality() {
        return nationality;
    }

    public void setNationality(int nationality) {
        this.nationality = nationality;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public int money(){
        return amount*2000;
    }

}
