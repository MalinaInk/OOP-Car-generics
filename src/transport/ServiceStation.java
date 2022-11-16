package transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Transport> transports = new ArrayDeque<>();
    //кладем объект в конец очереди, после обслуживания удаляем

    private void add(Transport transport) {
        transports.offer(transport);
    }
    //проватный метод для внутреннего пользования, публичные исключают попадание невалидных данных (автобусы)

    public void addPassengerCar(PassengerCars cars) {
        add(cars);
    }

    public void addTrucks(Trucks trucks) {
        add(trucks);
    }
    public void service() {
        if (!transports.isEmpty()) { //проверяем наличие объекта в очереди
            Transport transport = transports.poll(); //вынимаем объект из очереди
            boolean result = transport.service(); //ищем поломку
            if (!result) {
                transport.repair(); //если нашли - ремонтируем
            }
        }
    }
}
