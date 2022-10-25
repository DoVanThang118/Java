package session6;

public class Main {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            if (y == 0 ){
                throw new NullPointerException();
            }
            System.out.println(x+":"+y+"=");
            int z = x/y;
            System.out.println(z);
        }
        catch (ArithmeticException arithmeticException){ // ngoại lệ toán học
            System.out.println("loi roi nha !!!");
        }
        catch (NullPointerException nullPointerException){ // lỗi khi biến chưa đc cấp ô nhớ 
            System.out.println("Null .... !!!");
        }
        catch (Exception e){
            System.out.println("loi roi nha !!!");
        }
        finally { // luôn chạy qua đây
            System.out.println("loi roi nha !!!");
        }
    }
}
