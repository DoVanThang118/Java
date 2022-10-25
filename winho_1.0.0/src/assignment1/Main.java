package assignment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        Fraction f1 = new Fraction();
        f1.setTuSo(sc.nextInt());
        f1.setMauSo(sc.nextInt());
        f1.inPhanSo();

        Fraction f2 = new Fraction();
        f2.setTuSo(sc.nextInt());
        f2.setMauSo(sc.nextInt());
        f2.inPhanSo();

        Fraction t = f1.add(f2);
        t.inPhanSo();

        Fraction h = f1.sub(f2);
        h.inPhanSo();

        Fraction n = f1.mul(f2);
        n.inPhanSo();

        Fraction c = f1.div(f2);
        c.inPhanSo();
    }
}
