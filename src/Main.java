import transport.*;

public class Main {
    public static void main(String[] args) {

//по 4 объекта каждого подкласса (см дом.работу)
        PassengerCars lada = new PassengerCars("Lada", "B33", 1.2, 32, 250, TypeOfBody.SEDAN);
        PassengerCars audi = new PassengerCars("Audi", "A850 L TDI quattro", 3.0);
        PassengerCars bmv = new PassengerCars("BMW", "Z8", 3.0);
        PassengerCars kia = new PassengerCars("Kia", "Sportage 4-го поколения", 2.4);

        Trucks iveco = new Trucks("Iveco", "U78T3", 3.4, 24, 232, Weight.N1);
        Trucks daf = new Trucks("Daf", "900T7", 3.4);
        Trucks tatra = new Trucks("Tatra", "W007", 3.4);
        Trucks scania = new Trucks("Scania", "56oj7", 3.3);

        Buses ankai = new Buses("Ankai", "HFF6100G39C", 3.2, 30, 240, Capacity.MEDIUM);
        Buses isuzu = new Buses("Isuzu", "A09206", 3.1);
        Buses daewoo = new Buses("Daewoo", "BS090", 3.2);
        Buses anyats = new Buses("Ayats", "A6466", 3.0);

        lada.startMoving();
        lada.finishMoving();
        lada.pitStop(lada.getBrand());
        lada.showMaximumSpeed(lada.getMaximumSpeed());
        lada.showBestLapTime(lada.getBestLapTime());

        iveco.startMoving();
        iveco.finishMoving();
        iveco.pitStop(iveco.getBrand());
        iveco.showMaximumSpeed(iveco.getMaximumSpeed());
        iveco.showBestLapTime(iveco.getBestLapTime());

        ankai.startMoving();
        ankai.finishMoving();
        ankai.pitStop(ankai.getBrand());
        ankai.showMaximumSpeed(ankai.getMaximumSpeed());
        ankai.showBestLapTime(ankai.getBestLapTime());

        DriverAcategory diadiaVolodia = new DriverAcategory("Дядя Володя", true, 5, 'A');
        diadiaVolodia.raceInfo(ankai);
        diadiaVolodia.raceInfo(lada);
        diadiaVolodia.getCategory();
        lada.printType();

        DriverBcategory misterX = new DriverBcategory("Мистер Икс", true, 10, 'B');
        misterX.raceInfo(iveco);
        misterX.getCategory();
        iveco.printType();

        DriverCcategory bombila = new DriverCcategory("Бомбила", true, 8, 'B');
        bombila.raceInfo(ankai);
        bombila.getCategory();
        ankai.printType();

        service(lada, audi, bmv, kia,
                iveco, daf, tatra, scania,
                ankai, isuzu, daewoo, anyats);
    } //вызываем метод, передаем список для обработки

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);// перебираем аргументы, применяем к каждому метод ниже, выводим пойманные ошибки
        }
    }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.service()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику.");
            }
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}