package assignment3;

public class Vietnamese extends Customer {
    public String doiTuong;

    public Vietnamese() {
    }
    public Vietnamese(int code, String fullName, String date, int quantity, String doiTuong) {
        super(code, fullName, date, quantity);
        this.doiTuong = doiTuong;
    }

    public String getDoiTuong() {
        return doiTuong;
    }

    public void setDoiTuong(String doiTuong) {
        this.doiTuong = doiTuong;
    }


    public int thanhTien(){
        if (getQuantity()<=50)
            return getQuantity()*1000;
        else if (50<getQuantity()&&getQuantity()<=100)
            return 50*1000+(getQuantity()-50)*1200;
        else if (100<getQuantity()&&getQuantity()<=200)
            return 50*1000+50*1200+(getQuantity()-100)*1500;
        else
            return 50*1000+50*1200+100*1500+(getQuantity()-200)*2000;
    }
}
