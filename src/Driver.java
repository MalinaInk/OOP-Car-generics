import transport.PassengerCars;
import transport.Transport;

public class Driver <A extends Transport>{
    private String fullName;
    private boolean driverLicense;
    private int yearsOfExperience;



    public Driver(String fullName, boolean driverLicense, int yearsOfExperience) {
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
    }
}
