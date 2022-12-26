public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Лада","Гранта",1.7,"желтого цвета",2015,"Россия");

        Car audiA8 = new Car("Ауди","A8 50 L TDI quattro",3.0,"черного цвета",2020,"Германия");

        Car bmwZ8 = new Car("BMW","Z8",3.0,"черного цвета",2021,"Германия");

        Car kiaSportage = new Car("Kia","Sportage 4-го поколения",2.4,"красного цвета",2018,"Южная Корея");

        Car hyundaiAvante = new Car("Hyundai","Avante",1.6,"оранжевого цвета",2018,"Южная Корея");


        System.out.println(""+ladaGranta+'\n'+audiA8+'\n'+bmwZ8+'\n'+kiaSportage+'\n'+hyundaiAvante);

        Car ogogo =new Car(null,"Koenigsegg", 0, "", 10, "");
        System.out.println(ogogo);
        Car ogogo1=new Car();
        ogogo1.setBrand("Ferarri");
        ogogo1.setYear(2023);
        System.out.println(ogogo1);
    }
}