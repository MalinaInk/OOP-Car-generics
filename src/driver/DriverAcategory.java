package driver;

import transport.PassengerCars;

public class DriverAcategory extends Driver {
    private char category;
    private static final String LEGAL_SYMBOL = "ABC";

    public DriverAcategory(String fullName, boolean driverLicense, int yearsOfExperience, char category) {
        super(fullName, driverLicense, yearsOfExperience, category);
        this.category = category;
       }

    @Override
    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        if (!(LEGAL_SYMBOL.charAt(0) == category)) {
            throw new IllegalArgumentException("Необходимо указать другую категорию прав у " + getFullName() + "!");
        }
        this.category = category;
    }

    private void startMoving() {
        System.out.println("Водитель " + getFullName() + " начал движение.");
    }

    private void stopMoving() {
        System.out.println( "Водитель " + getFullName() + " заверщил движение.");
    }

    private void refuelTheCar() {
        System.out.println("Водитель " + getFullName() + " заправил авто.");
    }

    public void CategoryInfo() {
        System.out.println("Данный водитель имеет категорию " + getCategory());
    }

    protected void raceInfo(PassengerCars brand) {
        System.out.println(" Водитель " + getFullName() + " управляет автомобилем " + brand.getBrand()+ " и будет участвовать в заезде");
        }

    @Override
    public String toString() {
       return getFullName() + ", стаж вождения: " + getYearsOfExperience() + ", категория: A";
    }
}
