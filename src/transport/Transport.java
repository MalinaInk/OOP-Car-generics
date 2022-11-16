package transport;

import driver.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    private final List<Driver> drivers = new ArrayList<Driver>();
    private final List <Mechanic<?>> mechanics = new ArrayList<>();
    private final List <Sponsor> sponsors = new ArrayList<>();

    public List<Driver> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

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

    public void addDriver(Driver<?>... drivers){
        this.drivers.addAll(Arrays.asList(drivers));
    } public void addMechanic(Mechanic<?>... mechanics){
        this.mechanics.addAll(Arrays.asList(mechanics));

    } public void addSponsor(Sponsor... sponsors){
        this.sponsors.addAll(Arrays.asList(sponsors));
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

    public abstract void repair();

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
