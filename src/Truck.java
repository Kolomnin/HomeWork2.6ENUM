public class Truck extends Transport implements Сompeting {

    private WeightTruck weightTruck;

    public Truck(String brand, String model, double engineVolume, WeightTruck weightTruck) {
        super(brand, model, engineVolume);
        this.weightTruck = weightTruck;
    }

    public WeightTruck getWeightTruck() {
        return weightTruck;
    }

    public void setWeightTruck(WeightTruck weightTruck) {
        this.weightTruck = weightTruck;
    }

    public void pitStop() {
        System.out.println("Я на Пит-Стопе 30 сек");
    }

    public void bestLapTime() {
        System.out.println("Лучшее время круга 3 мин. 30 сек.");
    }

    public void maxSpeed() {
        System.out.println("Максимальная скорость 150 км/ч");
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль: " +
                "\nмарка " + getBrand() +
                ",\nмодель " + getModel() +
                ",\nобъем двигателя " + getEngineVolume();
    }

    @Override
    public void identifyType() {
        if (weightTruck == null) {
            System.out.println("Данных по автомобилю не достаточно");
        } else {
            String from = weightTruck.getFrom() ==null ? "" : "от " + weightTruck.getFrom() + " ";
            String to = weightTruck.getTo() ==null ? "" : "до " + weightTruck.getTo();
            System.out.println("Грузоподъемность атвомобиля:" + from + to);
        }
    }
}
