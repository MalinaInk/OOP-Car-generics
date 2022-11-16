package transport;

public enum Category {
    A ("PassengerCars"),
    B ("Trucks"),
    C ("Buses");

    private final String typeOfCar;


    Category(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }
}
