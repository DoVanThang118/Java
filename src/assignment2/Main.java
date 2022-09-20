package assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Account a = new Account();
        a.setBalance(sc.nextInt());

        Credit c = new Credit();
        c.setAmount(sc.nextInt());


    }
}
