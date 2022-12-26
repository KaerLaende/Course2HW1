public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car();
        ladaGranta.brand="Лада";
        ladaGranta.model="Гранта";
        ladaGranta.engineVolume=1.7;
        ladaGranta.color="желтого цвета";
        ladaGranta.country="Россия";
        ladaGranta.year=2015;

        Car audiA8 = new Car();
        audiA8.brand="Ауди";
        audiA8.model="A8 50 L TDI quattro";
        audiA8.engineVolume=3.0;
        audiA8.color="черного цвета";
        audiA8.country="Германия";
        audiA8.year=2020;

        Car bmwZ8 = new Car();
        bmwZ8.brand="BMW";
        bmwZ8.model="Z8";
        bmwZ8.engineVolume=3.0;
        bmwZ8.color="черного цвета";
        bmwZ8.country="Германия";
        bmwZ8.year=2021;

        Car kiaSportage = new Car();
        kiaSportage.brand="Kia";
        kiaSportage.model="Sportage 4-го поколения";
        kiaSportage.engineVolume=2.4;
        kiaSportage.color="красного цвета";
        kiaSportage.country="Южная Корея";
        kiaSportage.year=2018;

        Car hyundaiAvante = new Car();
        hyundaiAvante.brand="Hyundai";
        hyundaiAvante.model="Avante";
        hyundaiAvante.engineVolume=1.6;
        hyundaiAvante.color="оранжевого цвета";
        hyundaiAvante.country="Южная Корея";
        hyundaiAvante.year=2018;


        System.out.println(""+ladaGranta+'\n'+audiA8+'\n'+bmwZ8+'\n'+kiaSportage+'\n'+hyundaiAvante);

    }
}