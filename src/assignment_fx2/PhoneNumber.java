package assignment_fx2;

public class PhoneNumber {
    String name;
    String number;

    public PhoneNumber() {
    }

    public PhoneNumber(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String toString(){
        return getName()+"-"+getNumber()+"\n";
    }

}