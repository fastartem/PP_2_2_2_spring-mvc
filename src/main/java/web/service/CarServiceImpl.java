package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(int count, List<Car> cars) {
        return cars.subList(0, count);
    }
}
