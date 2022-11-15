package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {

        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 3.2;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void startMoving(){
        System.out.println("Автомобиль начинает движение...");
    }

    public void finishMoving() {
        System.out.println("Автомобиль завершает движение...");
    }

    public void printType() {
        System.out.println("Данных не достаточно");
    }

    public abstract boolean service();

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 3.2;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }


    @Override
    public String toString() {
        return " марка " + getBrand() + ", модель " + getModel() +
                ", объем двигателя " + getEngineVolume();
    }
}
