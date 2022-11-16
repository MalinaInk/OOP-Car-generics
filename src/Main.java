import driver.Driver;
import driver.DriverAcategory;
import driver.DriverBcategory;
import driver.DriverCcategory;
import transport.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//Спонсор только 1 добавляется
        Mechanic<PassengerCars> petr = new Mechanic<>("Петр", "Иванов", "VolgaPetrolium");
        Mechanic<Transport> anton = new Mechanic<>("Антон", "Игнатовский","TheSun");
        Mechanic<Trucks> dmitry = new Mechanic<>("Дмитрий", "Перевалов", "KingOfWorld");
        Mechanic<Buses> sasha = new Mechanic<>("Александр", "Пономарев", "РосГосАвтострах");
        Sponsor winline = new Sponsor("WinLine", 1_000_001);
        Sponsor gazprom = new Sponsor("Газпром", 2_000_050);
        Sponsor several = new Sponsor("SeverAl", 1_500_000);
        Sponsor adidas = new Sponsor("Adidas", 500_000);
        PassengerCars lada = new PassengerCars("Lada", "B33", 1.2, 32, 250, TypeOfBody.SEDAN);
        lada.addDriver(new DriverAcategory("Дядя Володя", true, 5, 'A'));
        lada.addMechanic(petr, anton);
        lada.addSponsor(several);
//        PassengerCars audi = new PassengerCars("Audi", "A850 L TDI quattro", 3.0);
//        PassengerCars bmv = new PassengerCars("BMW", "Z8", 3.0);
//        PassengerCars kia = new PassengerCars("Kia", "Sportage 4-го поколения", 2.4);

        Trucks iveco = new Trucks("Iveco", "U78T3", 3.4, 24, 232, Weight.N1);
        iveco.addDriver(new DriverBcategory("Мистер Икс", true, 10, 'B'));
        iveco.addMechanic(dmitry, anton);
        iveco.addSponsor(adidas, winline);

//        Trucks daf = new Trucks("Daf", "900T7", 3.4);
//        Trucks tatra = new Trucks("Tatra", "W007", 3.4);
//        Trucks scania = new Trucks("Scania", "56oj7", 3.3);

        Buses ankai = new Buses("Ankai", "HFF6100G39C", 3.2, 30, 240, Capacity.MEDIUM);
        ankai.addDriver(new DriverCcategory("Бомбила", true, 8, 'C'));
        ankai.addMechanic(sasha,anton);
        ankai.addSponsor(gazprom, winline);

//        Buses isuzu = new Buses("Isuzu", "A09206", 3.1);
//        Buses daewoo = new Buses("Daewoo", "BS090", 3.2);
//        Buses anyats = new Buses("Ayats", "A6466", 3.0);

//        lada.startMoving();
//        lada.finishMoving();
//        lada.pitStop(lada.getBrand());
//        lada.showMaximumSpeed(lada.getMaximumSpeed());
//        lada.showBestLapTime(lada.getBestLapTime());
//
//        iveco.startMoving();
//        iveco.finishMoving();
//        iveco.pitStop(iveco.getBrand());
//        iveco.showMaximumSpeed(iveco.getMaximumSpeed());
//        iveco.showBestLapTime(iveco.getBestLapTime());
//
//        ankai.startMoving();
//        ankai.finishMoving();
//        ankai.pitStop(ankai.getBrand());
//        ankai.showMaximumSpeed(ankai.getMaximumSpeed());
//        ankai.showBestLapTime(ankai.getBestLapTime());

//        driver.DriverAcategory diadiaVolodia = new driver.DriverAcategory("Дядя Володя", true, 5, 'A');
//        diadiaVolodia.raceInfo(ankai);
//        diadiaVolodia.raceInfo(lada);
//        diadiaVolodia.getCategory();
//        lada.printType();
//
//        driver.DriverBcategory misterX = new driver.DriverBcategory("Мистер Икс", true, 10, 'B');
//        misterX.raceInfo(iveco);
//        misterX.getCategory();
//        iveco.printType();
//
//        driver.DriverCcategory bombila = new driver.DriverCcategory("Бомбила", true, 8, 'B');
//        bombila.raceInfo(ankai);
//        bombila.getCategory();
//        ankai.printType();

        List<Transport> transports = List.of(lada, iveco, ankai);

        ServiceStation serviceStation = new ServiceStation(); //создаем объект класса для работы с очередью
        serviceStation.addPassengerCar(lada); //вызываем поочередно методы добавления и обслуживания
        serviceStation.addTrucks(iveco);
        serviceStation.service();
        serviceStation.service();

        for (Transport transport : transports){
            printInfo(transport);
        }


//        service(lada, audi, bmv, kia,
//                iveco, daf, tatra, scania,
//                ankai, isuzu, daewoo, anyats);
//    } //вызываем метод, передаем список для обработки

//    private static void service(Transport... transports) {
//        for (Transport transport : transports) {
//            serviceTransport(transport);// перебираем аргументы, применяем к каждому метод ниже, выводим пойманные ошибки
//        }
//    }
//
//    private static void serviceTransport(Transport transport) {
//        try {
//            if (!transport.service()) {
//                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику.");
//            }
//        } catch (RuntimeException e){
//            System.out.println(e.getMessage());
//        }
   }
    private static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители: " + transport.getDrivers());
        System.out.println("Спонсоры: " + transport.getSponsors());
        System.out.println("Механики: " + transport.getMechanics());
        System.out.println();
    }
    //    private static void printInfo(Transport transport) {
   //        System.out.println("Информация по автомобилю " + transport.getBrand() + " " + transport.getModel());
//        System.out.println("Водители: ");
//        for (Driver<?> driver : transport.getDrivers()) {
//            System.out.println(driver.getFullName());
//        }
//        System.out.println("Спонсоры: ");
//        for (Sponsor sponsor : transport.getSponsors()) {
//            System.out.println(sponsor.getName());
//        }
//        System.out.println("Механики: ");
//        for (Mechanic<?> mechanic : transport.getMechanics()) {
//            System.out.println(mechanic.getName() + " " + mechanic.getSurName() + " " + mechanic.getCompany());
//        }
//    }
}