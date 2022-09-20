package session2;

public class Human {

    String name;

    public Human() {

    }

    public Human(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println("Run: 5 km/h");
    }

    public void run(int x){
        System.out.println("Run: 10 km/h");
    }

    public void run(String y){
        System.out.println("Run: 15 km/h");
    }

    public void run(int x, int y){
        System.out.println("Run: 20 km/h");
    }

    public void run(int x, String y){
        System.out.println("Run: 25 km/h");
    }

}
