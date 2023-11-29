package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    List<Car> cars = Arrays.asList(
            new Car("BMW", "red", 150),
            new Car("VW", "blk", 100),
            new Car("NIS", "sil", 110),
            new Car("KIA", "gre", 120),
            new Car("AU", "wht", 170));

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, 5));
    }
}
