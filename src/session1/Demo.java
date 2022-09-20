package session1;

public class Demo {
    public static void main(String[] args){
        System.out.println("Hello ba gia");
        int x = 10;
        System.out.println("x = "+x);
        String str = "Hello ba gia";
        if (x>5){
            System.out.println(str);
        }else {
            System.out.println("not found");
        }
        for (int i = 0;i<10;i++){
            System.out.println("i= "+i);
        }

        Car c = new Car();
        Car c2 = new Car();

        c.brand = "Toyota";
        c2.year = 2000;

        Car.color = "red";
        System.out.println(Car.color);

        c.showInfo();
        c2.showInfo();

        Bike b = new Bike();
        b.run();
        System.out.println(Car.color);

        Triangle tg = new Triangle();
        tg.setX(4);
        tg.setY(5);
        tg.setZ(6);
        tg.dienTich();
        tg.chuVi();
        System.out.println( "dien tich = "+tg.dienTich()+" cm2");
        System.out.println("chu vi = "+tg.chuVi()+" cm");
    }
}
