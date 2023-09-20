package oops;
// If we Dont make a Main Method Static ITs A deadlock for its self because code is starting executing itself by main if main is non ststic than we need to create object of class but in execution its not possible
public class staticmethod {
    public static void main(String[] args) {
        mobile.show2();
        mobile obj = new mobile();
        obj.brand = "Samsung";
        obj.price = 12345;

        obj.show();
        
    }
}

class mobile{
    
    static String brand;
    static int price;
    static String name;


    public void show(){
        System.out.println();

    }


    public static void show2(){
        System.out.println(brand + " " + price + " " + name);
    }
}