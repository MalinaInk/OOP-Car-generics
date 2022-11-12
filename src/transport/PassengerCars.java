package transport;

public class PassengerCars extends Transport implements Competing{
    private int bestLapTime;
    private int maximumSpeed;

    public PassengerCars(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    public PassengerCars(String brand, String model, double engineVolume, int bestLapTime, int maximumSpeed) {
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
    }
    public void startMoving(){
        System.out.println("Пассажирский автомобиль начинает движение...");
    }

    public void finishMoving() {
        System.out.println("Пассажирский автомобиль завершает движение...");
    }

    @Override
    public void pitStop(String brand) {
        System.out.println("Пассажирский автомобиль " + getBrand() + " остановился для тех.обслуживания");
    }

    @Override
    public void showBestLapTime(int bestLapTime) {
        System.out.println("Лучшее время круга пассажирского автомобиля " + getBestLapTime() + " минут.");
    }

    @Override
    public void showMaximumSpeed(int maximumSpeed) {
        System.out.println("Максимальная скорость пассажирского автомобиля " + getMaximumSpeed() +"км/ч");
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
