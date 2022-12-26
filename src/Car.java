public class Car {
    /*
марка (brand),
модель (model),
объем двигателя в литрах (engineVolume),
цвет кузова (color),
год производства (year),
страна сборки (country).
     */
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    @Override
    public String toString() {
        return brand+" "+ model+" "+year+" год выпуска, сборка в стране "+country+", "+color+", объем двигателя — "+engineVolume+ " л.";
    }
}
