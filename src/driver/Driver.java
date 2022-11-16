package driver;

import transport.Transport;

import java.util.Objects;

public class Driver<A extends Transport>{
    private String fullName;
    private boolean driverLicense;
    private int yearsOfExperience;
    private char category;
    private static final String LEGAL_SYMBOL = "ABC";



    public Driver(String fullName, boolean driverLicense, int yearsOfExperience, char category) {
        if (fullName == null || fullName.isEmpty()) {
            this.fullName = "без регистрации";
        } else {
            this.fullName = fullName;
        }

        this.driverLicense = driverLicense;
        if (yearsOfExperience < 0) {
            this.yearsOfExperience = Math.abs(yearsOfExperience);
        } else {
            this.yearsOfExperience = yearsOfExperience;
        }
        setCategory(category);
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        if (!(LEGAL_SYMBOL.charAt(0) == category) || !(LEGAL_SYMBOL.charAt(1) == category) || !(LEGAL_SYMBOL.charAt(2) == category)) {
            throw new IllegalArgumentException("Недопустимый символ.");
        } else {
            this.category = category;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        if (yearsOfExperience < 0) {
            this.yearsOfExperience = Math.abs(yearsOfExperience);
        } else {
            this.yearsOfExperience = yearsOfExperience;
        }
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

    protected void raceInfo (A brand) {
        System.out.println();
    }

    @Override
    public String toString() {
        return fullName + ", стаж вождения: " + yearsOfExperience + ", категория: " + category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return driverLicense == driver.driverLicense && yearsOfExperience == driver.yearsOfExperience && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driverLicense, yearsOfExperience);
    }
}
