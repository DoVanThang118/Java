package section1;

import static java.lang.Math.sqrt;

public class Triangle {
    int x ;
    int y ;
    int z ;

    public Triangle(){
        System.out.println("bất ngờ chưa bà già !!!!!");
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public boolean ktTamGiac(){
        return x+y>z && x+z>y && y+z>x;
    }

    public int chuVi(){
        if (! ktTamGiac()) return 0;
        int S = x+y+z;
        return S;
    }

    public double dienTich(){
        if (! ktTamGiac()) return 0;
        double P = (sqrt((x+y+z)*(x+y-z)*(z+y-x)*(z+x-y)))/4.0;
        return P;
    }
}
