package Transport;

public class Car {

    //"имеют модификатор final":
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final int year;
    private final String country;


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
        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
        this.bodyType = bodyType;}
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

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, String regNumber, int seatsNumber, boolean tireType) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "brand";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "model";
        }
        if(engineVolume<=0){
            this.engineVolume=1.6;
        }else {
        this.engineVolume = engineVolume;}

        if (color!= null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "color";
        }
        if (year<1950){
            this.year=2000;
        }else {
        this.year = year;}
        if (country!= null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "country";
        }
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
        } else if (!sayCorrectRegNumber()) {
            this.regNumber="не корректный номер";
        } else {
            this.regNumber = "без номера";
        }
        if(seatsNumber<1){
            this.seatsNumber=2;
        }else {
            this.seatsNumber = seatsNumber;
        }
        this.tireType = tireType;
    }



    @Override
    public String toString() {
        return brand+" "+ model+" "+year+" год выпуска, сборка в стране "+country+", "+color+", объем двигателя — "+engineVolume+ " л."+
                " Коробка передач: "+transmission+"; Тип кузова: "+
                bodyType+"; Регистрационный номер: "+regNumber+"; Количество мест: "+seatsNumber+"; Резина: "+(tireType?"летняя.":"зимняя.");
    }
    //проверка правильности заполнения регистрационного номера "a000bc000":
    public boolean sayCorrectRegNumber(){
        if(regNumber.length()!=9){
            return false;
        }
        char[] chars=regNumber.toCharArray();
            if(!Character.isAlphabetic(chars[0])||!Character.isAlphabetic(chars[4])||!Character.isAlphabetic(chars[5])){
                return false;
            }
            if (!Character.isDigit(chars[1])||!Character.isDigit(chars[2])||!Character.isDigit(chars[3])||!Character.isDigit(chars[6])||!Character.isDigit(chars[7])||!Character.isDigit(chars[8])){
                return false;
            }
            return true;
    }

    public boolean changeTireType(){
        return tireType= !tireType;
    }
      public class Key{
       private final boolean outStart;
       private final boolean noKeyAccess;

        @Override
        public String toString() {
            return (outStart?"Удаленный запуск двигателя;": "")+ (noKeyAccess?" Бесключевой доступ":"");
            }

        public Key(boolean outStart, boolean noKeyAccess) {
            this.outStart = outStart;
            this.noKeyAccess = noKeyAccess;
        }
    }

}
