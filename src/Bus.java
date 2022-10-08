public class Bus extends Transport implements Сompeting {

    private TapeOfCapacityBus tapeOfCapacityBus;

    public Bus(String brand, String model, Double engineVolume, TapeOfCapacityBus tapeOfCapacityBus) {
        super(brand, model, engineVolume);
        this.tapeOfCapacityBus = tapeOfCapacityBus;
    }

    public TapeOfCapacityBus getTapeOfCapacityBus() {
        return tapeOfCapacityBus;
    }

    public void setTapeOfCapacityBus(TapeOfCapacityBus tapeOfCapacityBus) {
        this.tapeOfCapacityBus = tapeOfCapacityBus;
    }

    public void pitStop() {
        System.out.println("Я на Пит-Стопе 20 сек");
    }

    public void bestLapTime() {
        System.out.println("Лучшее время круга 3 мин. 30 сек.");
    }

    public void maxSpeed() {
        System.out.println("Максимальная скорость 100 км/ч");
    }

    @Override
    public String toString() {
        return "Автобус: " +
                "\nмарка " + getBrand() +
                ",\nмодель " + getModel() +
                ",\nобъем двигателя " + getEngineVolume();
    }

    @Override
    public void identifyType() {
        if (tapeOfCapacityBus == null) {
            System.out.println("Данных по автомобилю не достаточно");
        } else {
            System.out.println("Вместимость автобуса: от " + tapeOfCapacityBus.getFrom() + " до " + tapeOfCapacityBus.getTo());
        }
    }
}
