import Transport.Car;

import java.security.Key;

public class Main {
    public static void main(String[] args) {
    Car bmw = new Car("BMW", "z8",4.4,"синий",2022,"Германия","робот","седан","o007oo123",4,true);
    bmw.setBodyType("седан");
        System.out.println(bmw.isTireType());
    bmw.changeTireType();
        System.out.println(bmw);
        Car.Key bmwKey = bmw.new Key(true, true);
        System.out.println(bmw+" "+bmwKey);
    }
}