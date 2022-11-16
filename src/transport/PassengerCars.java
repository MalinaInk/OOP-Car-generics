package transport;

public class PassengerCars extends Transport implements Competing{
    private int bestLapTime;
    private int maximumSpeed;

    private TypeOfBody typeOfBody;

    public PassengerCars(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    public PassengerCars(String brand, String model, double engineVolume, int bestLapTime, int maximumSpeed,TypeOfBody typeOfBody) {
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
        this.typeOfBody = typeOfBody;
    }
    public void startMoving(){
        System.out.println("Пассажирский автомобиль начинает движение...");
    }

    public void finishMoving() {
        System.out.println("Пассажирский автомобиль завершает движение...");
    }

    @Override
    public void printType() {
        if (typeOfBody == null) {
            System.out.println("Данных не достаточно");
        } else {
            System.out.println("Тип авто: " + typeOfBody);
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.7; //50*50 вероятность прохождения диагностики
    }

    @Override
    public void repair() {
        System.out.println("Машина " + getBrand() + " " + getModel() + " починена");
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

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
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
