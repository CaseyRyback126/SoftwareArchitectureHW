/*
   Принцип единственной ответственности (Single Responsibility Principle)
   Класс Car отвечает только за базовую функциональность автомобиля
 */

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /*
       Принцип открытости/закрытости (Open-Closed Principle)
       Метод startEngine() может быть переопределен в дочерних классах
       с учетом особенностей конкретной модели автомобиля
     */
    public void startEngine() {
        System.out.println("Engine started");
    }

    public void stopEngine() {
        System.out.println("Engine stopped");
    }
}
