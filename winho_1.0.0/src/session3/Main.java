package session3;

import assignment2.Account;

import java.util.ArrayList;

public class Main {
    public static void mainAnimal(){
        Animal animal = new Animal();
        animal.run();

        Dog dog = new Dog();
        dog.run();
        dog.eat();

        BullDog bullDog = new BullDog();

    }


    public  static void main(String[] args){
        int[]  intarrays = new int[5];
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add("hello word");
        arrayList.add(new Account());
        arrayList.remove(0);
        arrayList.remove("hello word");

        ArrayList<String> strArray = new ArrayList<>();
        strArray.add("asd");

        for (String s: strArray){
            System.out.println(s);
        }

        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(5);
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(10.5);
    }
}
