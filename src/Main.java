import Transport.Car;

public class Main {
    public static void main(String[] args) {
    Car bmw = new Car("робот","купе","",5,true);
    bmw.setBodyType("седан");
        System.out.println(bmw.isTireType());
    bmw.changeTireType();
        System.out.println(bmw);
    }
}