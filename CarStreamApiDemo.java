package assignment;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

class Car {
    private String name;
    private String carName;
    private double price;


    public Car(String name, String carName, double price) {
        this.name = name;
        this.carName = carName;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCarName() {
        return carName;
    }

    public double getPrice() {
        return price;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class CarImplementation {


    public double sumOfPrices(List<Car> carList) {
        return carList.stream()
                .map(Car::getPrice)
                .reduce(0.0, Double::sum);
    }


    public List<String> printName(List<Car> carList) {
        return carList.stream()
                .filter(car -> car.getPrice() > 25000)
                .map(Car::getCarName)
                .collect(Collectors.toList());
    }

    // Method to get the maximum car price
    public double maxPrice(List<Car> carList) {
        return carList.stream()
                .map(Car::getPrice)
                .max(Double::compare)
                .orElse(0.0);
    }
}

public class CarStreamApiDemo {
    public static void main(String[] args) {
        List<Car> carList = Arrays.asList(
                new Car("John", "Alfa Romeo", 50000),
                new Car("Alice", "Bugatti", 800000),
                new Car("Bob", "Chrysler", 45000),
                new Car("Eve", "Dodge", 55000),
                new Car("Sam", "Essen", 910000),
                new Car("Max", "Ford", 20000)
        );

        CarImplementation carImpl = new CarImplementation();

        System.out.println(carImpl.sumOfPrices(carList));
        System.out.println(carImpl.printName(carList));
        System.out.println(carImpl.maxPrice(carList));
    }
}
