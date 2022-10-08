

public class Car extends Transport implements Сompeting {

    private BodyTypeCar bodyTypeCar;

    public Car(String brand, String model, double engineVolume, BodyTypeCar bodyTypeCar) {
        super(brand, model, engineVolume);
        this.bodyTypeCar = bodyTypeCar;
    }

    public BodyTypeCar getBodyTypeCar() {
        return bodyTypeCar;
    }

    public void setBodyTypeCar(BodyTypeCar bodyTypeCar) {
        this.bodyTypeCar = bodyTypeCar;
    }

    public void pitStop() {
        System.out.println("Я на Пит-Стопе 15 сек");
    }

    public void bestLapTime() {
        System.out.println("Лучшее время круга 1 мин. 30 сек.");
    }

    public void maxSpeed() {
        System.out.println("Максимальная скорость 220 км/ч");
    }

    @Override
    public String toString() {
        return "Легковой автомобиль: " +
                "\nмарка " + getBrand() +
                ",\nмодель " + getModel() +
                ",\nобъем двигателя " + getEngineVolume();
    }

    @Override
    public void identifyType() {
        if (bodyTypeCar == null) {
            System.out.println("Данных по автомобилю не достаточно");
        } else {
            System.out.println("Тип атвомобиля:" + bodyTypeCar);
        }
    }
}



