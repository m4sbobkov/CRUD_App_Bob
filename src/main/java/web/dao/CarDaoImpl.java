package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {

    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMV", "Black", "Mike"));
        cars.add(new Car("Priora", "Pink", "Ashot"));
        cars.add(new Car("Mercedes", "White", "Jhon"));
        cars.add(new Car("Audi", "Green", "Taylor"));
        cars.add(new Car("Granta", "Gray", "Bob"));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(Integer amount) {
        return amount > cars.size() ? cars : cars.stream().limit(amount).collect(Collectors.toList());
    }
}
