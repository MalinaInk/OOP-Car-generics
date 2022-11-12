import transport.PassengerCars;
import transport.Trucks;

public class DriverBcategory extends Driver {
    private static final String LICENSE_CATEGORY = "B";

    public DriverBcategory(String fullName, boolean driverLicense, int yearsOfExperience) {
        super(fullName, driverLicense, yearsOfExperience);
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

    public void getCategory() {
        System.out.println("Данный водитель имеет категорию " + LICENSE_CATEGORY);
    }
    protected void raceInfo(Trucks brand) {
        System.out.println(" Водитель " + getFullName() + " управляет автомобилем " + brand.getBrand()+ " и будет участвовать в заезде");
    }
}
