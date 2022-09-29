package assignment5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        INews n = new INews();
        Scanner sc = new Scanner(System.in);
        n.RateList = new int[]{9, 8, 10};
        System.out.println(n.AverageRate);
    }
}
