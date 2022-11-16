package transport;

import driver.Driver;

import java.util.*;


public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    private final Set<Driver> drivers = new HashSet<Driver>();
    private final Set <Mechanic<?>> mechanics = new HashSet<>();
    private final Set <Sponsor> sponsors = new HashSet<>();

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}
