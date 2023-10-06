package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    // Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Lada", "Vesta", 2022);
        assertTrue(car instanceof Vehicle);
    }

    //Проверить, что объект Car создается с 4-мя колесами.
    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Lada", "Vesta", 2022);
        assertEquals(car.getNumWheels(), 4);
    }

    // Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Low Rider ST", 2022);
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    // Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void testCarSpeed() {
        Car car = new Car("Lada", "Vesta", 2022);
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    // Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    public void testMotorcycleSpeed() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Low Rider ST", 2022);
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    // Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    public void testCarPark() {
        Car car = new Car("Lada", "Vesta", 2022);
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    // Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    public void testMotorcyclePark() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Bolt", 2017);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}