/*
    Пример дочернего класса Car,
    который наследует базовую функциональность и переопределяет метод startEngine()
 */


public class SportCar extends Car{

    public SportCar(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void startEngine() {
        System.out.println("Vroom! Engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Tires screech");
    }
}
