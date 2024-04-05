package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private final List<Car> cars = Arrays.asList(
            new Car("Mercedes-Benz ML 350", 2013, "blue"),
            new Car("Lada Vesta Cross", 2023, "red"),
            new Car("Chery Tiggo 8 Pro Max", 2024, "green"),
            new Car("Toyota Camry", 2001, "white"),
            new Car("BMW M5", 1992, "yellow"));


    @Override
    public List<Car> getAllCars() {
        return this.cars;
    }
}
