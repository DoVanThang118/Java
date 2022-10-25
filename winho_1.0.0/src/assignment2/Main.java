package assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Account A = new Account(123,"win",500000);

        System.out.println("nhập số tiền muốn rút: ");
        int x = sc.nextInt();
        if (A.debit(x)){
            System.out.println("rut thành công "+x);
        }else{
            System.out.println("số dư không đủ");
        }

        Account B = new Account(456,"ho",950);
        System.out.println("nhập số tiền muốn gui: ");
        int y = sc.nextInt();
        if (A.tranferTo(B,y)){
            System.out.println("chuyen thanh cong "+y+" sang tai khoan "+B.getName());
        }else{
            System.out.println("số dư không đủ");
        }
    }
}
