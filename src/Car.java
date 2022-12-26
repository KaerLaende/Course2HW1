public class Car {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand==null){
            brand="default";
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {

        if (model==null){
            model="default";
        }
        this.model = model;
        if (engineVolume<=0){
            engineVolume=1.5;
        }
        this.engineVolume = engineVolume;
        if (color==null){
            color="белый";
        }
        this.color = color;
        if (year<=1940){
            year=2000;
        }
        this.year = year;
        if (country==null){
            country="default";
        }
        this.country = country;
    }

    public Car(double engineVolume, String color, int year) {
        brand="default";
        model="default";
        country="default";
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
    }

    public Car(String brand, String model, String country) {
        engineVolume=1.5;
        color="белый";
        year=2000;
        this.brand = brand;
        this.model = model;
        this.country = country;
    }

    public Car() {
        if (brand==null){
            brand="default";
        }
        if (model==null){
            model="default";
        }
        if (engineVolume<=0){
            engineVolume=1.5;
        }
        if (year<=1940){
            year=2000;
        }
        if (country==null){
            country="default";
        }
        if (color==null){
            color="белый";
        }
    }

    @Override
    public String toString() {
        return brand+" "+ model+" "+year+" год выпуска, сборка в стране "+country+", "+color+", объем двигателя — "+engineVolume+ " л.";
    }
}
