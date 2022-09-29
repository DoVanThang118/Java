package assignment3;

public class Foreigner extends Customer {
    public int nationality;

    public Foreigner() {
    }

    public Foreigner(int code, String fullName, String date, int quantity, int nationality) {
        super(code, fullName, date, quantity);
        this.nationality = nationality;
    }

    public int getNationality() {
        return nationality;
    }

    public void setNationality(int nationality) {
        this.nationality = nationality;
    }

    @Override
    public int thanhTien() {
        return super.thanhTien();
    }
}
