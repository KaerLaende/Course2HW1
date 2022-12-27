package Transport;

public class Car {

    //"имеют модификатор final":
    final String brand ="BMW";
    final String model= "M5";
    final double engineVolume= 4.4;
    final String color="синий";
    final int year=2022;
    final String country="Германия";


    /*       Добавляем:
                    «Коробка передач»,
                    «Тип кузова»,
                    «Регистрационный номер»,
                    «Количество мест»,
                    признак «Летняя» или «Зимняя резина».
            */
    private String transmission;
    private String bodyType;
    private String regNumber;
    private int seatsNumber;
    private boolean tireType=true;//Резина: true=летняя, иначе - зимняя.

    //первичные геттеры:
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }
    public String getCountry() {
        return country;
    }

    // Новые геттеры и сеттеры:
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public String getBodyType() {
        return bodyType;
    }
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
    public String getRegNumber() {
        return regNumber;
    }
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
    public int getSeatsNumber() {
        return seatsNumber;
    }
    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }
    public String isTireType() {
        if (tireType){
            return "летняя";
        }
        return "зимняя";
    }
    public void setTireType(boolean tireType) {
        this.tireType = tireType;
    }

    public Car(String transmission, String bodyType, String regNumber, int seatsNumber, boolean tireType) {
        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = "Автомат";
        }
        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "седан";
        }
        if (regNumber != null && !regNumber.isEmpty() && !regNumber.isBlank()) {
            this.regNumber = regNumber;
        } else {
            this.regNumber = "без номера";
        }
        this.seatsNumber = seatsNumber;
        this.tireType = tireType;
    }


    @Override
    public String toString() {
        return brand+" "+ model+" "+year+" год выпуска, сборка в стране "+country+", "+color+", объем двигателя — "+engineVolume+ " л."+" Коробка передач: "+transmission+"; Тип кузова: "+bodyType+"; Регистрационный номер: "+regNumber+"; Количество мест: "+seatsNumber+"; Резина: "+(tireType?"летняя.":"зимняя.");
    }
    public boolean changeTireType(){
        return tireType= !tireType;
    }
}
