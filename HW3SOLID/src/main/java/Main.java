public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new SportCar("Ferrari", "LaFerrari", 2021);

        car1.startEngine(); // Вывод: Engine started
        car1.stopEngine();
        car2.startEngine(); // Вывод: Vroom! Engine started
        car2.stopEngine();
    }
}
