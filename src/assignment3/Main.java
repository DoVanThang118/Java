package assignment3;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        Vietnamese vietnamese = new Vietnamese(1,"asd","2022-9-22",219,"ca nhan");
        Foreigner foreigner = new Foreigner(1,"asd","2022-9-22",219,1);
        System.out.println(vietnamese.thanhTien());
        System.out.println(foreigner.thanhTien());


        Customer customer = (Customer) new Vietnamese(2,"gfr","2022-9-22",219,"ca nhan");
        System.out.println(customer.thanhTien());
    }
}
