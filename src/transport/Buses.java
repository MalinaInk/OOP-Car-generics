package transport;

public class Buses extends Transport implements Competing {

    private int bestLapTime;
    private int maximumSpeed;

    private Capacity capacity;

    public Buses(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public Buses(String brand, String model, double engineVolume, int bestLapTime, int maximumSpeed, Capacity capacity) {
        super(brand, model, engineVolume);
        if (bestLapTime <= 0) {
            this.bestLapTime = 20;
        } else {
            this.bestLapTime = bestLapTime;
        }

        if (maximumSpeed <= 0) {
            this.maximumSpeed = 120;
        } else  {
            this.maximumSpeed = maximumSpeed;
        }
        this.capacity = capacity;
    }

    public void startMoving(){
        System.out.println("Автобус начинает движение...");
    }

    public void finishMoving() {
        System.out.println("Автобус завершает движение...");
    }

    @Override
    public void pitStop(String brand) {
        System.out.println("Автобус " + getBrand() + " остановился для тех.обслуживания");
    }

    @Override
    public void showBestLapTime(int bestLapTime) {
        System.out.println("Лучшее время круга автобуса " + getBestLapTime() + " минут.");
    }

    @Override
    public void showMaximumSpeed(int maximumSpeed) {
        System.out.println("Максимальная скорость автобуса " + getMaximumSpeed() +"км/ч");
    }
    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных не достаточно");
        } else {
            System.out.println("Вместимость автобуса: от " + capacity.getFrom() + " чел. до " + capacity.getTo() + " чел.");
        }
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public int getBestLapTime() {
        return bestLapTime;
    }

    public void setBestLapTime(int bestLapTime) {
        if (bestLapTime <= 0) {
            this.bestLapTime = 20;
        } else {
            this.bestLapTime = bestLapTime;
        }
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        if (maximumSpeed <= 0) {
            this.maximumSpeed = 120;
        } else {
            this.maximumSpeed = maximumSpeed;
        }
    }
}
