package transport;

public class Trucks extends Transport implements Competing{
    private int bestLapTime;
    private int maximumSpeed;

    private  Weight weight;

    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    public Trucks(String brand, String model, double engineVolume, int bestLapTime, int maximumSpeed, Weight weight) {
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

        this.weight = weight;
    }
    public void startMoving(){
        System.out.println("Грузовой автомобиль начинает движение...");
    }

    public void finishMoving() {
        System.out.println("Грузовой автомобиль завершает движение...");
    }
    @Override
    public void pitStop(String brand) {
        System.out.println("Грузовой автомобиль " + getBrand() + " остановился для тех.обслуживания");
    }

    @Override
    public void showBestLapTime(int bestLapTime) {
        System.out.println("Лучшее время круга грузового автомобиля " + getBestLapTime() + " минут.");
    }

    @Override
    public void showMaximumSpeed(int maximumSpeed) {
        System.out.println("Максимальная скорость грузового автомобиля " + getMaximumSpeed() +"км/ч");
    }

    @Override
    public void printType() {
        if (weight == null) {
            System.out.println("Данных не достаточно");
        } else {
            String from = weight.getFrom() == null ? "" : "от " + weight.getFrom() + " т.";
            String to = weight.getTo() == null ? "" : "до " + weight.getTo() + " т.";
            System.out.println("Грузоподъемность авто: " + from + to);
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.75; //50*50 вероятность прохождения диагностики
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

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
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
