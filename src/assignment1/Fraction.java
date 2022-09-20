package assignment1;

import static java.lang.Math.abs;
import static java.lang.Math.min;

public class Fraction {
    public int tuSo;
    public int mauSo;

    public Fraction() {
        System.out.println("bất ngờ chưa bà già !!!!!");
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public void inPhanSo(){
        System.out.println(getTuSo()+"/"+getMauSo());
    }

    public void rutGon(){
        int ucln = min(abs(tuSo),abs(mauSo));
        for(int i = min(abs(tuSo),abs(mauSo));i>1;i--){
            if (tuSo%i ==0 && mauSo%i ==0){
                ucln = i;
                break;
            }
        }
        setTuSo(tuSo/ucln);
        setMauSo(mauSo/ucln);
    }

    public void nghichDao(){
        int tmp = tuSo;
        tuSo = mauSo;
        mauSo = tmp;
    }

    public Fraction add( Fraction f){
        Fraction tong = new Fraction();
        tong.setTuSo(this.tuSo*f.mauSo+this.mauSo*f.tuSo);
        tong.setMauSo(this.mauSo*f.mauSo);
        tong.rutGon();
        return tong;
    }

    public Fraction sub( Fraction f){
        Fraction hieu = new Fraction();
        hieu.tuSo = this.tuSo*f.mauSo-this.mauSo*f.tuSo;
        hieu.mauSo = this.mauSo*f.mauSo;
        hieu.rutGon();
        return hieu;
    }

    public Fraction mul( Fraction f){
        Fraction tich = new Fraction();
        tich.setTuSo(this.tuSo*f.tuSo);
        tich.setMauSo(this.mauSo*f.mauSo);
        tich.rutGon();
        return tich;
    }

    public void div(){

    }
}
